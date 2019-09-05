import java.util.ArrayList;


public class Kontor extends Rom {
	private int kontplasser;	//  max utleie av folk
	ArrayList<Ansatt> ansattListe;

	public Kontor(char bygning, int etasje, int romnummer, int kontplasser){
		super(bygning, etasje,  romnummer);
		ansattListe = new ArrayList<>();
		setKontorplasser(kontplasser);
	}

/*
	public String toString() {
		String resultat = bygning + "-" + etasje;
		if (romnummer < 10) resultat += "0";
		resultat += romnummer;

		return resultat;
	}
*/

	public void setKontorplasser(int kontplasser){
		this.kontplasser=kontplasser;
	}


	public int getKontorplasser() {
		return kontplasser;
	}



	public void kontorDel(String navn){ 
		
		for(int i=0;i<ansattListe.size();i+=1 ){
			if(ansattListe.get(i).getFornavn()!=navn){
							System.out.println("kotorpartner detected");
							ansattListe.get(i).toString();
			}
		}
	}

	public void utskriftansatte(){
		for(int i=0;i<ansattListe.size();i+=1 ){
			System.out.println(ansattListe.get(i));
		}
	}
	

	public void nyAnsatt(String fornavn, String etternavn, String epostadresse, String telefon, Kontor kontor){

		if(ansattListe.size()>=kontplasser){
			ansattListe.add(new Ansatt( fornavn,  etternavn,  epostadresse,  telefon,  kontor));
		}else{
			System.out.println("Det er fullt");
		}
	}

}
