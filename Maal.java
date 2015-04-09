import javafx.scene.image.Image;

class Maal extends AbstraktRute{
    public Maal(int x, int y) {
        super(x, y, "exit.jpg");
    }


    @Override
    public void flyttTil(Spiller spiller) {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.exit(0);

    }




    @Override
    public Image GetRuteBilde(){
        return null;
    }
	
}