import javafx.scene.paint.Paint;

class Spiller extends AbstraktRute{
    Spiller(int str,int n,int m) {
        super(str,n,m);
        rekt.setStroke(Paint.valueOf("orange"));
        rekt.setFill(Paint.valueOf("purple"));
    }

    void flytt(int xDif, int yDif){
        x=x+xDif;
        y=y+yDif;
    }

    public void setNode(int xdiff,int ydiff) {
        x=x+xdiff;
        y=y+ydiff;
    }

}