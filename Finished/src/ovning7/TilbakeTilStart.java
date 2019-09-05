package ovning7;

/**
 * Created by gaute_000 on 12.05.2015.
 */
public class TilbakeTilStart extends AbstraktRute{
    public TilbakeTilStart(int posisjon) {
        super(posisjon);
    }


    @Override
    public void flyttHit(Spiller spiller) {
        //      Kaller først på
        super.flyttHit(spiller);
        System.out.println("Ups,"+spiller.getNavn()+" Du havnet paa en Tilbake til start Rute " + 0 + " paa brettet");
        spiller.setPosisjon(0);

    }
}
