import javafx.scene.paint.Paint;

class Maal extends AbstraktRute{



    Maal(int str,int n, int m) {
        super(str, n ,m);
        gyldig=true;
        maal=true;
        rekt.setStroke(Paint.valueOf("orange"));
        rekt.setFill(Paint.valueOf("steelblue"));

    }
}