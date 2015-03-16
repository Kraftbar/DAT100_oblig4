import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Random;
import java.util.Scanner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Oblig8 extends Application {
    public static void main(String[] args) {

        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gjettespill");

		Random rand = new Random();
    	int tall = rand.nextInt(1000);
    	int tallgjett=0;
    	String tull=null;


		TextField input = new TextField("input");
//		input.setPrefColumnCount(15);


		Text output= new Text("output");
		input.setPrefColumnCount(15);


		//test
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
 //       gridpane.setHgap(10);
 //       gridpane.setVgap(10);


		

        Button btn = new Button();
        btn.setText("OK");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 



            @Override
            public void handle(ActionEvent event) {
        		System.out.println("Du trykket");
        		System.out.println(tull);
        		System.out.println(tallgjett);        		        		
      			tull=input.getText();
                tallgjett=Integer.parseInt(input.getText());

				if(tall>tallgjett){
					output.setText("For lavt");
				}else if(tall<tallgjett){
					output.setText("For hoyt");
				}else{
					output.setText("Riktig!!");
				}

            }
        });
        


        StackPane root = new StackPane();

		root.getChildren().add(input);
 		root.getChildren().add(btn);
        root.getChildren().add(output);

     	root.setAlignment(btn, Pos.TOP_RIGHT);
     	root.setAlignment(output, Pos.TOP_LEFT);
     	root.setAlignment(input, Pos.BOTTOM_CENTER);


        primaryStage.setScene(new Scene(root, 150, 100));
        primaryStage.show();

			

		

    }
}