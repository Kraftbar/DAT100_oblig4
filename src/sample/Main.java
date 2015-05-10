package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        Integer[] hei = {6,3,2};
        Double[] hallo ={6.0,3.0,2.0};
        printMe(hei, hallo);
    }



    public static <T> T[] printMe(T[] forste,T[] andre){
    int hvormangelike=0;
        for(T n : forste){
            for(T m : andre){
                if(n.equals(m)){
                    System.out.println("LIKT");
                }
            }
        }
            return forste;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
