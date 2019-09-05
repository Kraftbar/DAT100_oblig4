import javafx.scene.image.Image;

class Vei extends AbstraktRute{

    public Vei(int x, int y) {
        super(x, y, "floor.jpg");
    }

    @Override
    public void flyttTil(Spiller spiller) {

    }

    @Override
    public Image GetRuteBilde() {
        return null;
    }
}