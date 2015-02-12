
public class Kontor extends Rom {
	private int antfolkIrommet; //  nå utleide plasser
	private int kontplasser=-1;	//  max utleie av folk
	private Ansatt [] ansattListe;	

	public Kontor(char bygning, int etasje, int romnummer, int kontplasser){
		super(bygning, etasje,  romnummer);

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
