package ovning7;

/**
 * Created by gaute_000 on 12.05.2015.
 */

import java.util.Scanner;

public class Spiller {
    private String navn;
    private int posisjon;

    public Spiller(String navn) {
        this.navn = navn;
        posisjon = 0;
    }

    public Spiller(String navn, int starttall) {
        this.navn = navn;
        this.posisjon = starttall;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getPosisjon() {
        return posisjon;
    }

    public void setPosisjon(int posisjon) {this.posisjon = posisjon;}

    @Override
    public String toString() {
        return "Spiller{" +
                "navn='" + navn + '\'' +
                ", posisjon=" + posisjon +
                '}';
    }
}

