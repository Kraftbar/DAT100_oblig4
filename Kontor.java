
public class Kontor {
	private char bygning;
	private int etasje;
	private int romnummer;
	private int antfolkIrommet; //  nå utleide plasser
	private int kontplasser=-1;	//  max utleie av folk
	private Ansatt [] ansattListe;	

	
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
		ansattListe = new Ansatt [kontplasser]; //lir oprettet ovenfor
		kontplasser=kontplasser+1;

	}
		
	public void kontorDel(String navn){ 
		
		for(int i=0;i<antfolkIrommet;i+=1 ){
			if(ansattListe[i].getFornavn()!=navn){
							System.out.println("kotorpartner detected");
							ansattListe[i].toString();
			}
		}
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


	public void utskriftansatte(){
		for(int i=0;i<antfolkIrommet;i+=1 ){
			System.out.println(ansattListe[i]);
		}
	}



	public void nyAnsatt(String fornavn, String etternavn, String epostadresse, String telefon, Kontor kontor){

		if(antfolkIrommet>=kontplasser){
			ansattListe[antfolkIrommet]=  new Ansatt( fornavn,  etternavn,  epostadresse,  telefon,  kontor);
			antfolkIrommet=antfolkIrommet+1;
		}else{
			System.out.println("Det er fullt");
		}
	}
	

}
