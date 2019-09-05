import javafx.scene.image.Image;

class Spiller extends AbstraktRute{


    public Spiller(int x, int y) {
        super(x, y, "player.jpg");
    }

    @Override
    public void flyttTil(Spiller spiller) {

    }

    @Override
    public Image GetRuteBilde() {
        return null;
    }

    public Image getBilde() {
        return ruteBilde;
    }

}

