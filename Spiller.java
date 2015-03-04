package veispill_med_hinder;

import java.util.Scanner;

public class Spiller {
	private String navn;
	private int posisjon;
	
	public Spiller(String navn) {
		this.navn = navn;
		posisjon = 0;
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
	
	public void setPosisjon(int posisjon) {
		this.posisjon = posisjon;
	}
	
	
}
