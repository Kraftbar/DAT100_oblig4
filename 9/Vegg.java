import javafx.scene.image.Image;

class Vegg extends AbstraktRute{
    public Vegg(int x, int y) {
        super(x, y, "wall.jpg");
    }

    @Override
    public void flyttTil(Spiller spiller) {

    }

    @Override
    public Image GetRuteBilde() {
        return null;
    }
}