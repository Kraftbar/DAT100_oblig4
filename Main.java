

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;




import javafx.event.EventHandler;

import javafx.stage.FileChooser;
import javafx.stage.Stage;




import javafx.scene.Scene;

import javafx.scene.shape.Rectangle;


public class Main extends Application{
    
    AbstraktRute[][] rutenett;
    String tull;
    char cahrtull;
    Spiller spiller;

    Stage primaryStage;
    int bredde, hoyde;
    int startX, startY;
    GridPane rootGrid;


    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) {


            try{
                this.primaryStage = primaryStage;
                rootGrid = new GridPane();
                EventHandler<KeyEvent> eventHandler = event -> {
                    KeyCode code = event.getCode();
                    int xDir = 0;
                    int yDir = 0;
                    if(code==KeyCode.UP){
                        yDir = -1;

                    }
                    else if(code==KeyCode.DOWN){
                        yDir = 1;

                    }
                    else if(code==KeyCode.LEFT){
                        xDir = -1;
                    }
                    else if(code==KeyCode.RIGHT){
                        xDir = 1;
                    }
                    rutenett[spiller.getX() + xDir][spiller.getY() + yDir].flyttTil(spiller);
                    CreateScene();
                };
                LoadRuter();
                Scene scene = new Scene(rootGrid, bredde*32,hoyde*32);
                scene.setOnKeyPressed(eventHandler);
                primaryStage.setScene(scene);
                primaryStage.setTitle("Labyrintspill");

                spiller = new Spiller(startX, startY);
                CreateScene();
                primaryStage.show();
            }catch (Exception e){
                e.printStackTrace();
            }
    }





    public void visRuter(Spiller spiller){
        for(int y=-1; y<2; y++){
            for(int x = -1; x<2; x++){
                rutenett[spiller.getX() + x][spiller.getY() + y].setOppdaget(true);
            }
        }
    }

    public void CreateScene(){
        rootGrid.getChildren().clear();
        visRuter(spiller);
        for(int y = 0; y< hoyde; y++){
            for(int x=0; x < bredde; x++){
                Node node;
                if (rutenett[x][y].oppdaget()){
                    node = new ImageView(rutenett[x][y].getRuteBilde());
                }
                else{
                    Rectangle rect = new Rectangle(32, 32);
                    rect.getStyleClass().add("Ikke oppdaget");
                    node = rect;

                }
                rootGrid.add(node, x, y);
                if(spiller.getX() == x && spiller.getY() == y){
                    ImageView spillerBilde = new ImageView(spiller.getBilde());
                    rootGrid.add(spillerBilde, x, y);
                }
            }
        }
    }

    public void LoadRuter(){
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Åpne labyrintfil");
        chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Textfil", "*.txt"));
        File f = null;
        while (f==null){
            f = chooser.showOpenDialog(primaryStage);
        }
        try{
            List<String> allLines = Files.readAllLines(f.toPath());
            String[] items = new String[allLines.size()];
            rutenett = ParseRuter(allLines.toArray(items));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public AbstraktRute[][] ParseRuter(String[] allLines){

        bredde = Integer.parseInt(allLines[0]);
        hoyde = Integer.parseInt(allLines[1]);
        AbstraktRute[][] rutenett = new AbstraktRute[bredde][hoyde];

        for(int y=0; y<hoyde; y++){
            char[] linjeChars = allLines[y + 2].toCharArray();
            for(int x=0; x < bredde; x++){

                rutenett[x][y] = ParseRuter(linjeChars[x],x,y);
            }
        }
        return rutenett;
    }

    public AbstraktRute ParseRuter(char type, int x, int y){
        switch(type){
            case '#':
                return new Vegg(x, y);
            case '-':
                return new Maal(x, y);
            case '*':
                startX = x;
                startY = y;
                return new Spiller(x, y);
            default:
                return new Vei(x, y);

        }
    }

    public void lesOgLagBane(){



        File file = new File("testlabyrint_fra_oppgaveteksten.txt"); //for ex foo.txt
        try {
            Scanner sc = new Scanner(file);
            int lengde = sc.nextInt();
            int hoyde = sc.nextInt();
            sc.nextLine();

            rutenett= new AbstraktRute[lengde][hoyde];


/*

                    for (int i = 0; i < hoyde; i++) {
                        for (int j = 0; j < lengde; j++) {
                            System.out.println(i + " " + j);

                            Rectangle rectangle = new Rectangle(10, 10);
                            rectangle.setStroke(Paint.valueOf("orange"));
                            rectangle.setFill(Paint.valueOf("steelblue"));
                            gridPane.add(rectangle, hoyde, lengde);


                        }
                    }

*/

            for(int m=0;m<hoyde;m++){
                System.out.println("\n");
                tull = sc.nextLine();
                for(int n=0;n<lengde;n++){

                    cahrtull = tull.charAt(n);
                    System.out.print(cahrtull);




                    switch (cahrtull) {
                        case '#':
                            rutenett[n][m]= new Vegg(n, m);


                            break;
                        case ' ':
                            rutenett[n][m]= new Vei(n,m);
                            break;
                        case '*':
                            rutenett[n][m]= new Spiller(n,m);
                            break;
                        case '-':
                            rutenett[n][m]= new Maal(n,m);
                            break;
                        default: System.out.println("ugyldig fil");
                            break;
                    }

                }

            }

            sc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
// manipulere strings https://docs.oracle.com/javase/tutorial/java/data/manipstrings.html





