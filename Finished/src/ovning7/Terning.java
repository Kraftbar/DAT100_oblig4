package ovning7;

/**
 * Created by gaute_000 on 12.05.2015.
 */
public class Terning {
    private int verdi;
    private int antallSider;

    public Terning() {
        antallSider = 6;
        verdi = 1;
    }

    public Terning(int sider) {
        antallSider = sider;
        verdi = 1;
    }

    public int kast() {
        verdi = (int)(Math.random()*antallSider) + 1;
        return 0;
    }

    public int getVerdi() {
        return verdi;
    }

    public int getAntallSider() {
        return antallSider;
    }
}

