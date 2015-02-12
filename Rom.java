public class Rom {


	private char bygning;
	private int etasje;
	private int romnummer;

	public Rom(char bygning, int etasje, int romnummer){
		setBygning(bygning);
		setEtasje(etasje);
		setRomnummer(romnummer);

	}

	public char getBygning() {
		return bygning;
	}
	
	public void setBygning(char bygning) {
		this.bygning = bygning;
	}
	
	public int getEtasje() {
		return etasje;
	}
	
	public void setEtasje(int etasje) {
		this.etasje = etasje;
	}
	
	public int getRomnummer() {
		return romnummer;
	}
	
	public void setRomnummer(int romnummer) {
		this.romnummer = romnummer;
	}



	public String toString() {
		String resultat = bygning + "-" + etasje;
		if (romnummer < 10) resultat += "0";
		resultat += romnummer;

/*
		resultat += romnummer+"\n ";
		for(int i=0;i<antfolkIrommet;i+=1 ){
			System.out.println(ansattListe[i]);
		}
*/		

		return resultat;
	}



	
}