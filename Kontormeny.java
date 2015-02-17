import java.util.Scanner;
import java.util.ArrayList;

public class Kontormeny {

// legger til en kommentar
	public static void main(String[] args) {
		programlokke();
	}

	public static void programlokke(){
	ArrayList<Rom> romListe = new ArrayList<Rom>();
    ArrayList<Kontor> kontorListe = new ArrayList<Kontor>();
    ArrayList<Undervisningsrom> undervisningsromListe = new ArrayList<Undervisningsrom>();



		System.out.println("Programmet har startet!");
		boolean streaming;
		int avslutt=0;
		int valg;
		int antKont=0;
    	int tull;
		int etasjenr;
		int romnr;
		String svar;
		String romsvar;

		Scanner inn = new Scanner(System.in);
		while(avslutt==0){

			System.out.println("\n \n Vendligst velg et av alternativene nedenfor");
			System.out.println(" 1 - Opprett et rom (E402)");
			System.out.println(" 2 - add en til");
			System.out.println(" 3 - utskriftansatte");
			System.out.println(" 4 - Opprett nytt rom");
			System.out.println(" 5 - Ny");
			System.out.println();
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
	            	System.out.println("sjekk om harman deler kontor med noen");
	           		svar =inn.nextLine();
	           	 	kontorListe.get(0).kontorDel("herman");
	                break;
	            case 3:  

					for(int i=0;i<kontorListe.size();i+=1 ){
						kontorListe.get(0).utskriftansatte();
					}
					break;
	            case 4:  
	            System.out.println(" hvilket type bygg (eks. A...E)?");
				inn.nextLine();
	            romsvar =inn.nextLine();
	            System.out.println(" Hvilken etasje (tall)?");

	            etasjenr =inn.nextInt();
	            System.out.println(" Hvilket Romnummer? ");
	            romnr =inn.nextInt();


				System.out.println(" Skal rommet bli brukt som Undervisningsrom eller Kontor (j/n)");
				inn.nextLine();
				svar =inn.nextLine();

				
				tull =svar.charAt(0);

				if(tull==106){  // 106=j


		            System.out.println(" 1. Kontor");
					System.out.println(" 2. Undervisningsrom");
					valg = inn.nextInt();
			        switch (valg) {
			        	case 1:
			            	System.out.println("Ant. kontorplasser?");
							tull=inn.nextInt();
							kontorListe.add(new Kontor(romsvar.charAt(0), etasjenr, romnr,tull));
			        		break;
						default: System.out.println("Ugylidig valg");
	                		break;
			        	case 2:
			            	System.out.println("Kapastitet?");
			            	tull=inn.nextInt();
			            	System.out.println("Streaming? (true/false)");
			            	streaming= inn.nextBoolean();
	    	        		undervisningsromListe.add(new Undervisningsrom(romsvar.charAt(0), etasjenr, romnr,tull,streaming));
			            	break;

	                	}

				}else{
	    	        romListe.add(new Rom(romsvar.charAt(0), etasjenr, romnr));
				}
	                break;
	            case 5: 
					break;
	            default: System.out.println("Ugylidig valg");
	                break;
	        }
		}
	}

}