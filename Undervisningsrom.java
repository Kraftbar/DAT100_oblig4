public class Undervisningsrom extends Rom {

int kapasitet;
boolean streaming;
	public Undervisningsrom(char bygning, int etasje, int romnummer, int kapasitet, boolean streaming){
		super(bygning, etasje,  romnummer);
		ansattListe = new ArrayList<>();
		setKapasitet(kapasitet);
		setStreaming(streaming);
	}


	public void setKapasitet(kapasitet){
		
	}

	public int getKapasitet(){
		return kapasitet;
	}


	public void setStreaming(){
		this.streaming=streaming;
	}


	public boolean getStreaming() {
		return streaming;
	}


}