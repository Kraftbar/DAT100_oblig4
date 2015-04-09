

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.layout.GridPane;



    import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;  



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application{
    
GridPane gridPane;
AbstraktRute[][] rutenett;
String tull;
char cahrtull;

    public static void main(String[] args) {

        launch(args);

    }
    






    @Override
    public void start(Stage primaryStage) {


        lesOgLagBane();




        primaryStage.setTitle("GridPane example");

        //Adding GridPane
        GridPane gridPane = new GridPane();

        // 2D array of Buttons with value of 5,5
        Rectangle [][] btn = new Rectangle [5][5];

        //Column is a vertical line and row is a horizontal line
        //Two FOR loops used for creating 2D array of buttons with values i,j
        for(int i=0; i<btn.length; i++){
            for(int j=0; j<btn.length;j++){

                //Initializing 2D buttons with values i,j
                btn[i][j] = new Rectangle (50,50);
                btn[i][j].setStroke(Paint.valueOf("orange"));
                btn[i][j].setFill(Paint.valueOf("steelblue"));
                gridPane.add(btn[i][j], i, j);


            }
        }

        //Adding GridPane to the scene
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();




   }

    public void lagBilde(){}



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
                        rutenett[n][m]= new Vegg();                    


                        break;
                    case ' ':
                        rutenett[n][m]= new Vei();                    
                        break;
                    case '*':
                        rutenett[n][m]= new Spiller();                    
                        break;
                    case '-':
                        rutenett[n][m]= new Maal();
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





