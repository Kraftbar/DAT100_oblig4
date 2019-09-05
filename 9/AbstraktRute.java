import javafx.scene.image.Image;

public abstract class AbstraktRute   {


    int x, y;
    boolean oppdaget;
    Image ruteBilde;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean oppdaget(){
        return oppdaget;
    }

    public void setOppdaget(boolean oppdaget){
        this.oppdaget = oppdaget;
    }

    public AbstraktRute(int x, int y, String ruteBilde) {
        this.x = x;
        this.y = y;
        this.ruteBilde = new Image(getClass().getResourceAsStream(ruteBilde));
    }

    public abstract void flyttTil(Spiller spiller);

    public abstract Image GetRuteBilde();

    public Image getRuteBilde(){
        return ruteBilde;
    }

    public void setRuteBilde(Image bilde){
        this.ruteBilde = bilde;
    }


}