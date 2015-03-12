import java.util.Scanner;
import java.util.ArrayList;

public class Main {


public static void main(String[] args) {


	ArrayList<Spiller> spillerliste= new ArrayList<Spiller>();


	Scanner inn = new Scanner(System.in);
	boolean avslutt=true;
	int valg;


	String tullS;

	while(avslutt){

			System.out.println("\n \n Vendligst velg et av alternativene nedenfor");
			System.out.println(" 1 - Spill en runde");
			System.out.println(" 2 - Legg til en spiller");
			System.out.println(" 3 - Utskrift av spillere");
			System.out.println(" 4 - Oprett masse tull (test)");
			System.out.println();
			valg = inn.nextInt();
	        switch (valg) {
	        	case 0:
	            	avslutt=true;
	            	break;
	            case 1:
					for(int i=0;i<spillerliste.size();i=i+1){
					spillerliste.get(i).gjorTrekk();
					}

					break;	
	            case 2:  
	            	System.out.println("Navn paa spiller?");
					tullS=inn.nextLine();
					spillerliste.add(new Spiller(tullS));

					break;
	            case 3:  
				for(int i=0;i<spillerliste.size();i=i+1){
					System.out.println(spillerliste.get(i).toString());

				}
					break;
				case 4:
					spillerliste.add(new Spiller("Martin"));
					spillerliste.add(new Spiller("Fleskefjes"));
					spillerliste.add(new Spiller("Fiskefjes"));

				break;

	            default: System.out.println("Ugylidig valg");
	                break;
	        }
		}







}

}
