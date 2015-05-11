package sample;

public class Fiende extends AbstraktRing implements Runnable{
    Fiende(int n,int m,int str){
        super(n,m,str);
    }

    // Her kan du bruke fks. Thread.sleep(200ms)
    @Override
    public void run() {

    }
}
