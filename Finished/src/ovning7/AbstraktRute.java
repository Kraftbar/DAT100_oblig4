package ovning7;

import java.util.ArrayList;

    /**
 * Created by gaute_000 on 12.05.2015.
 */
public class AbstraktRute implements Rute {

    int posisjonBrett;

    public AbstraktRute(int posisjon) {
        this.posisjonBrett = posisjon;
    }

    public int getPosisjon() {
        return posisjonBrett;
    }

        @Override
        public String toString() {
            return "AbstraktRute{" +
                    "posisjonBrett=" + posisjonBrett +
                    '}';
        }

        public void flyttHit(Spiller spiller) {
        System.out.println(spiller.getNavn()+" fikk "+(posisjonBrett-spiller.getPosisjon())+" og har flyttet til posisjon "+ posisjonBrett+ " paa brettet");
    }
}
