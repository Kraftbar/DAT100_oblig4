import javafx.scene.paint.Paint;

class Vei extends AbstraktRute{

    Vei(int str,int n,int m) {
        super(str,n,m);
        gyldig=true;
        rekt.setStroke(Paint.valueOf("orange"));
        rekt.setFill(Paint.valueOf("black"));
    }
}