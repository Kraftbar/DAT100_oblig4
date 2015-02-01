
public class Kontor {
	private char bygning;
	private int etasje;
	private int romnummer;
	private int antfolkIrommet; //  nå utleide plasser
	private int kontplasser=0;	//  max utleie av folk
	private Ansatt [] muligfolkIrommet;	

	
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


	public Kontor(char bygning, int etasje, int romnummer, int kontplasser){
		this.bygning = bygning;
		this.etasje = etasje;
		this.romnummer = romnummer;
		muligfolkIrommet = new Ansatt [kontplasser]; //lir oprettet ovenfor

	}
		

	public String toString() {
		String resultat = bygning + "-" + etasje;
		if (romnummer < 10) resultat += "0";
		resultat += romnummer;

/*
		resultat += romnummer+"\n ";
		for(int i=0;i<antfolkIrommet;i+=1 ){
			System.out.println(muligfolkIrommet[i]);
		}
*/		

		return resultat;
	}


	public void utskriftansatte(){
		for(int i=0;i<antfolkIrommet;i+=1 ){
			System.out.println(muligfolkIrommet[i]);
		}
	}



	public void nyAnsatt(String fornavn, String etternavn, String epostadresse, String telefon, Kontor kontor){

		if(antfolkIrommet>=kontplasser){
			muligfolkIrommet[antfolkIrommet]=  new Ansatt( fornavn,  etternavn,  epostadresse,  telefon,  kontor);
			antfolkIrommet=antfolkIrommet+1;
		}else{
			System.out.println("Det er fullt");
		}
	}
	

}
