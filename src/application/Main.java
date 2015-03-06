package application;
	
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


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*
			 * FlowPane eksempel
			 * 
			FlowPane root = new FlowPane();

			Button knapp = new Button("Knapp");			
			Label teksten = new Label("Hello World");
			TextField tekstfelt = new TextField("Find");
			tekstfelt.setPrefColumnCount(15);
			
			root.getChildren().add(teksten);
			root.getChildren().add(tekstfelt);
			root.getChildren().add(knapp);

			root.setHgap(4);
			root.setVgap(4);
			root.setColumnHalignment(HPos.CENTER);
			
			* BorderPane eksempel
			
			BorderPane root = new BorderPane();
			root.setBottom(knapp);
			TextArea tekstomraade = new TextArea();
			root.setCenter(tekstomraade);
			Label teksten = new Label("Hello World");
			root.setTop(teksten);
			*/

			/*
			 *  GridPane eksempel. Bruker en GridPane som layout for å lage et vindu for å skrive inn x-
			 *  og y-koordinater for et punkt
			 */
			GridPane root = new GridPane();
			
			Label xLabel = new Label("X:");
			Label yLabel = new Label("Y:");
			TextField xField = new TextField();
			xField.setPrefColumnCount(5);		// Setter foretrukket bredde på tekstfeltet
			TextField yField = new TextField();
			yField.setPrefColumnCount(5);
			
			/*
			 * Legger inn komponentene i gridPane-objektet. Gridpanen finner ut hvor mange celler den trenger
			 * i x- og y-retning fra posisjonene som objektene som ligger i den har.
			 */
			root.add(xLabel, 0, 0);
			root.add(yLabel, 0, 1);
			root.add(xField, 1, 0);
			root.add(yField, 1, 1);

			/*
			 * Lager litt åpning mellom pomponentene
			 */
			root.setHgap(4);
			root.setVgap(4);
			
			// Lager scenen som skal inneholde gridpane objektet
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			// Setter opp og viser vinduet (primaryStage)
			primaryStage.setScene(scene);
			primaryStage.sizeToScene();
			primaryStage.setTitle("Første java fx test");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
