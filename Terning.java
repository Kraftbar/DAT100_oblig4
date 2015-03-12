
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
	
	public void kast() {
		verdi = (int)(Math.random()*antallSider) + 1;
	}
	
	public int getVerdi() {
		return verdi;
	}
	
	public int getAntallSider() {
		return antallSider;
	}
}
