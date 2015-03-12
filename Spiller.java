
import java.util.Scanner;
import java.util.ArrayList;


public class Spiller {
	private String navn;
	private int posisjon;
	public Spiller(String navn) {
		Terning terning = new Terning();
		this.navn = navn;
		posisjon = 0;
	}
	


	public String toString() {
		return "Fornavn:   " + navn + "\n"+ "Posisjon: " + posisjon + "\n";
	
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
