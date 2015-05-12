package ovning7;

/**
 * Created by gaute_000 on 12.05.2015.
 */
public class VanligRute extends AbstraktRute{
    public VanligRute(int posisjon) {
        super(posisjon);
    }

    @Override
    public void flyttHit(Spiller spiller) {
        super.flyttHit(spiller);
        spiller.setPosisjon(posisjonBrett);
    }
}
