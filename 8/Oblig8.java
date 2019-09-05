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

	
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Line;
import static java.lang.Math.*;



public class Oblig8 extends Application {
    	int tall;
    	int sistgjett;
    	String tull;
    	boolean nermere;
    	int tallgjett;
		Random rand;
		int teller;

    public static void main(String[] args) {

        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Gjettespill");

		rand = new Random();
    	tall = rand.nextInt(1000);
    	sistgjett=-212;
    	tull=null;
    	tallgjett=0;
		

		TextField input = new TextField("input");




		Text catchs= new Text("");


		Text output= new Text("output");

		Line linje = new Line(0, 0, 200, 0);

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));




        Button btn = new Button();
        btn.setText("OK");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 



            @Override
            public void handle(ActionEvent event) { 

        		catchs.setText("");
        		try{

	            	if(Integer.parseInt(input.getText())<0 || Integer.parseInt(input.getText())-tall>1001){
						output.setText("Skriv inn gyldig tall");
	        		}else{

			            	System.out.println("Tallet du gjettet er: " +Math.abs(Integer.parseInt(input.getText())-tall)+"  unna");


			            	//				gammelt										ny
			            	if(Math.abs(tallgjett - tall)>Math.abs(Integer.parseInt(input.getText()) - tall)){	
			            		nermere =true;
			            	}else{
			            		nermere=false;
			            	}

			                tallgjett=Integer.parseInt(input.getText());	// sist blir overskrevet




		        		System.out.println("tallet er "+tall);        		        		





						if(tall>tallgjett){
							if(nermere){
								output.setText("For lavt, men du er nermere. Dette er ditt " +teller +". forsok");
								teller++;
							}else{	
								output.setText("For lavt, du er legre vekke. Dette er ditt " +teller +". forsok");
								teller++;
							}
							
						}else if(tall<tallgjett){
							if(nermere){
								output.setText("For hoyt, men du er nermere. Dette er ditt " +teller +". forsok");
								teller++;
							}else{
								output.setText("For hoyt, du er legre vekke. Dette er ditt " +teller+ ". forsok");
								teller++;
							}
						}else{
							output.setText("Riktig!!");
		        			System.out.println("Riktig!");        		        		

							    System.exit(0);
						}
		 
				
			

				}
}catch(Exception e) {
	          
					catchs.setText("Skriv inn gyldig tall");

	            	}
            }
        });
        


        StackPane root = new StackPane();
        root.getChildren().add(catchs);


		root.getChildren().add(input);
 		root.getChildren().add(btn);
        root.getChildren().add(output);
        root.getChildren().add(linje);

     	root.setAlignment(btn, Pos.TOP_RIGHT);
     	root.setAlignment(output, Pos.TOP_LEFT);
     	root.setAlignment(input, Pos.BOTTOM_CENTER);
     	root.setAlignment(catchs, Pos.CENTER);


        primaryStage.setScene(new Scene(root, 300, 150));
        primaryStage.show();

    }
}