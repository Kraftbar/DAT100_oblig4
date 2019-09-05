import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

class Vegg extends AbstraktRute {

    Vegg(int str, int n, int m) {
        super(str,n,m);
        rekt.setStroke(Paint.valueOf("orange"));
        rekt.setFill(Paint.valueOf("blue"));
    }



}