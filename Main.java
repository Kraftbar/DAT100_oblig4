

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




        Group root = new Group();

        gridPane = new GridPane();
        Scene scene = new Scene(root, 500, 500  , Color.WHITE); 




        primaryStage.setTitle("java-buddy.blogspot.com");
       


        root.getChildren().add(gridPane);        

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


            rutenett= new AbstraktRute[lengde][hoyde];
  //          gridPane.setPrefSize(lengde, hoyde);
//           gridPane.setVgap(10);
  //          gridPane.setHgap(10);


            sc.nextLine();

/*
            while (sc.hasNextLine()) {
                int i = sc.nextInt();
                System.out.println(i);
            }
            int hoyde=0;
            int lengde=0;

*/





                    for (int i = 0; i < hoyde; i++) {
                        for (int j = 0; j < lengde; j++) {
                            System.out.println(i+" "+j);

                            Rectangle rectangle = new Rectangle(10, 10);
                            rectangle.setStroke(Paint.valueOf("orange"));
                            rectangle.setFill(Paint.valueOf("steelblue"));
                            gridPane.add(rectangle, hoyde, lengde);



                        }
                    }                


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





