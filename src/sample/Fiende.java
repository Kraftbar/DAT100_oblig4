package sample;

import javafx.scene.paint.Paint;

public class Fiende extends AbstraktRing implements Runnable{
    Fiende(int n,int m,int str){
        super(n,m,str/2);
        rekt.setFill(Paint.valueOf("Red"));
    }

    // Her kan du bruke fks. Thread.sleep(200ms)
    @Override
    public void run() {


    }
}
