public class Undervisningsrom extends Rom {

int kapasitet;
boolean streaming;
	public Undervisningsrom(char bygning, int etasje, int romnummer, int kapasitet, boolean streaming){
		super(bygning, etasje,  romnummer);
		setKapasitet(kapasitet);
		setStreaming(streaming);
	}

/*
	public String toString() {
		String resultat = bygning + "-" + etasje;
		if (romnummer < 10) resultat += "0";
		resultat += romnummer;

		return resultat;
	}
*/

	public void setKapasitet(int kapasitet){
		this.kapasitet=kapasitet;
	}

	public int getKapasitet(){
		return kapasitet;
	}


	public void setStreaming(boolean streaming){
		this.streaming=streaming;
	}


	public boolean getStreaming() {
		return streaming;
	}


}