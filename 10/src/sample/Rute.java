package sample;

import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Rute {
    boolean spiller, finde, godbit;
    int x, y;
    Rectangle rekt;

        Rute(int n, int m, int str){
            x=n;
            y=m;
            this.rekt = new Rectangle(str,str);
            rekt.setStroke(Paint.valueOf("lightblue"));
            rekt.setFill(Paint.valueOf("Black"));
        }


    public Node getNode(){return rekt;}
    int getX(){return x;}
    int getY(){return y;}
}
