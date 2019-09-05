import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.security.acl.Group;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.xml.soap.Text;


public class Main extends Application{

    Spiller spiller;
    GridPane gridPane;
    AbstraktRute[][] rutenett;
    String tull;
    char cahrtull;

    int str=30;

    int lengde;
    int hoyde;

    public static void main(String[] args) {launch(args);}

    @Override
    public void start(final Stage primaryStage) {


        primaryStage.setTitle("GridPane example");

        //Adding GridPane
         gridPane = new GridPane();


        lesOgLagBane();


        //Adding GridPane to the scene
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);


        EventHandler<KeyEvent> eventHandler = new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                KeyCode code = event.getCode();
                int xDir = 0;
                int yDir = 0;
                if (code == KeyCode.UP) {
                    yDir = -1;
                } else if (code == KeyCode.DOWN) {
                    yDir = 1;
                } else if (code == KeyCode.LEFT) {
                    xDir = -1;
                } else if (code == KeyCode.RIGHT) {
                    xDir = 1;
                }

                // Hvert ruteobjekt har fått tildelt en boolean om det er lov gå på den
                if(rutenett[spiller.getX()+xDir][spiller.getY()+yDir].getGyldig()) {

                    // Flytter spiller
                    // Egentlig litt dum, spiller burde vært lokalt i main, ikke objekt (etter min mening)
                    gridPane.getChildren().remove(spiller.getNode());
                    spiller.flytt(xDir, yDir);
                    gridPane.add(spiller.getNode(), spiller.getX(), spiller.getY());
                    if(rutenett[spiller.getX()+xDir][spiller.getY()+yDir].getMaal()){
                        //exit


                        // Prøver på å få opp en dialog - "Du vant!"
                        /*
                        Stage dialog = new Stage();
                        dialog.initStyle(StageStyle.UTILITY);
                        Scene scene = new Scene(new Group(new Text(25, 25, "Hello World!")));
                        dialog.setScene(scene);
                        dialog.show();
                        */

                    }
                }

            }
        };
        scene.setOnKeyPressed(eventHandler);


        primaryStage.show();




   }




    public void lesOgLagBane(){
   File file = new File("testlabyrint_storre.txt"); //for ex foo.txt
       try {
        Scanner sc = new Scanner(file);
            lengde = sc.nextInt();
            hoyde = sc.nextInt();
            sc.nextLine();

            rutenett= new AbstraktRute[lengde][hoyde];



           for(int m=0;m<hoyde;m++){
                tull = sc.nextLine();
                for(int n=0;n<lengde;n++){
                    cahrtull = tull.charAt(n);
                    switch (cahrtull) {
                    case '#':
                        rutenett[n][m]= new Vegg(str,n,m);
                        gridPane.add(rutenett[n][m].getNode(),n, m);
                        break;
                    case ' ':
                        rutenett[n][m]= new Vei(str,n,m);
                        gridPane.add(rutenett[n][m].getNode(),n, m);
                        break;
                    case '*':
                        rutenett[n][m]= new Vei(str,n,m);
                        gridPane.add(rutenett[n][m].getNode(),n, m);
                        spiller = new Spiller(str,n,m);
                        gridPane.add(spiller.getNode(), n, m);
                        break;
                    case '-':
                        rutenett[n][m]= new Maal(str, n, m);
                        gridPane.add(rutenett[n][m].getNode(),n, m);
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
    boolean gyldingTrekk(int xDir,int yDir){


        return false;
    }
}





// manipulere strings https://docs.oracle.com/javase/tutorial/java/data/manipstrings.html





