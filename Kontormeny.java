import java.util.Scanner;
import java.util.ArrayList;

public class Kontormeny {

// legger til en kommentar
	public static void main(String[] args) {
		programlokke();
	}

	public static void programlokke(){
    ArrayList<Kontor> kontorListe = new ArrayList<Kontor>();

		System.out.println("Programmet har startet!");
		int avslutt=0;
		int valg;
		int antKont=0;
		Scanner inn = new Scanner(System.in);
		while(avslutt==0){

			System.out.println("\n \n Vendligst velg et av alternativene nedenfor");
			System.out.println(" 1 - Opprett et rom (E402)");
			System.out.println(" 2 - add en til");
			System.out.println(" 3 - utskriftansatte");
			System.out.println();
			valg = inn.nextInt();
	        switch (valg) {
	        	case 0:
	            	avslutt=1;
	            	break;
	            case 1:
	            kontorListe.add(new Kontor('E', 4, 2,3));


					System.out.println(kontorListe.get(0));
					kontorListe.get(0).nyAnsatt("herman","testensen","geiboi@dsf.com","34242232",kontorListe.get(0));	            
					kontorListe.get(0).utskriftansatte();

					System.out.println(kontorListe.get(0));
					kontorListe.get(0).nyAnsatt("Bjorn","testensen","geiboi@dsf.com","34242232",kontorListe.get(0));	            
					kontorListe.get(0).utskriftansatte();

					break;
	            case 2:  
	                break;
	            case 3:  

				kontorListe.get(0).utskriftansatte();
					break;
	            case 4:  
	                break;
	            case 5: 
					break;
	            default: System.out.println("Ugylidig valg");
	                break;
	        }
		}
	}

}

