package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.security.Key;
import java.util.HashMap;
import java.util.Random;

public class Main extends Application {
    GridPane gridPane;
    Rute[][] rutenett;
    int dimenjon=10;
    int str=(500/dimenjon);
    Spiller spiller;
    Random rand=new Random();
    int randX, randY = 0;
    Godbit[] gotterier;


    @Override
    public void start(Stage primaryStage) throws Exception{

        genererSpiller();

        /*
        // vet ikke hva som skjer?
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        */
        primaryStage.setTitle("Space invaders");
        gridPane = new GridPane();
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);


        // tegner forhåpentligvis hele brettet på nytt
        rutenett= new Rute[dimenjon][dimenjon];
        genererBrett();

        // aner ikke, bedre her nede enn en smørje der oppe
        primaryStage.show();


        // vet ikke hvordan det funker
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
                gridPane.getChildren().remove(spiller.getNode());
                spiller.flytt(xDir, yDir);
                gridPane.add(spiller.getNode(), spiller.getX(), spiller.getY());

                // Her Skal jeg kalle på finder?

            }
        };
        scene.setOnKeyPressed(eventHandler);


    }

    //hvorfor får jeg ikke se den før jeg flytter?
    private void genererSpiller() {
        randX= rand.nextInt(dimenjon);
        randY= rand.nextInt(dimenjon);

        System.out.println(randX+ " "+randY);

        spiller = new Spiller(randX,randY,str);
    //  gridPane.add(spiller.getNode(), spiller.getX(), spiller.getY());

    }


    void generGodbit() {
        for (int i = 0; i > 5; i++){
            randX = rand.nextInt(dimenjon);
            randY = rand.nextInt(dimenjon);
            //gotterier[0] = new Godbit(randX,randY,str);


        }
    }

    private void genererBrett() {
        for(int m=0;m<dimenjon;m++){
            for(int n=0;n<dimenjon;n++) {
                rutenett[n][m] = new Rute(n,m,str);
                gridPane.add(rutenett[n][m].getNode(), n, m);
            }
        }

    }


    public static <T> T[] erLik(T[] forste,T[] andre){
        for(T n : forste){
            for(T m : andre){
                System.out.println(n + " lik " +m+" ?");
                if(n.equals(m)){
                    System.out.println(n + "  ER " +m);
                }
            }
        }
            return forste;
    }


    public static void main(String[] args) {launch(args);
    }
}
