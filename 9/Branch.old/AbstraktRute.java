import javafx.scene.Node;
import javafx.scene.shape.Rectangle;

public abstract class AbstraktRute{
    int x, y;
    Rectangle rekt;
    boolean gyldig;
    boolean maal;


    AbstraktRute(int str, int n, int m){
        x=n;
        y=m;
        this.rekt = new Rectangle(str,str);
    }



    public Node getNode(){
        return rekt;
    }
    boolean getGyldig(){
        return gyldig;
    }
    boolean getMaal(){
        return maal;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
}