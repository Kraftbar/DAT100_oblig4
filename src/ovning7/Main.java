package ovning7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by gaute_000 on 12.05.2015.
 */
public class Main {

    static int verdiTerning;
    static int antruter=20;

    static ArrayList<AbstraktRute> ruter;
    static ArrayList<Spiller> spillere;
    static Terning terning;
    public static void main(String[]args){
        terning = new Terning();

        gerererBrett();
        genererSpillere();

        programlokke();


    }

    private static void programlokke() {
        System.out.println("Enter one of the following commands:");
        System.out.println("1 - kjorEnRunde");
        System.out.println("2 - utskriftAvSpillere");
        System.out.println("3 - utskriftAvRuter");
        System.out.println("4 - utskriftAvRuter");
        System.out.println("5 - exit");
        Scanner scanchoice = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter \"1\", \"2\", \"3\", \"4\" or \"5\"");
        int choiceentry = scanchoice.nextInt();

        while (choiceentry != 6) {
            choiceentry = scanchoice.nextInt();

            if (choiceentry < 1 || choiceentry > 5) {

                System.out.println("Enter \"1\", \"2\", \"3\", \"4\", \"5\" or \"6\"");
            }

            else if(choiceentry == 1) {
                kjorEnRunde();            }
            else if(choiceentry == 2) {
                utskriftAvSpillere();
            }
            else if(choiceentry == 3) {
                utskriftAvRuter();
            }
            else if(choiceentry == 4) {
                utskriftAvRuter();

            }
            else if(choiceentry == 5) {
                break;
            } else{
                System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
            }

        }
    }


    static void kjorEnRunde() {
        for (Spiller j : spillere) {
            terning.kast();
            int kast = terning.getVerdi();
            j.setPosisjon(j.getPosisjon()+kast);
        }
    }



    private static void utskriftAvRuter() {
            for(AbstraktRute j : ruter){
                System.out.println(j.toString()); //egendef

            }
    }


    static void utskriftAvSpillere(){
        for(Spiller j: spillere ){
            System.out.println(j.toString()); //egendef

        }

    }

    private static void genererSpillere() {
        spillere = new ArrayList<>();
        spillere.add(new Spiller("Gaute"));
        spillere.add(new Spiller("Paal"));
        spillere.add(new Spiller("Roar"));

    }

    private static void gerererBrett() {
        ruter = new ArrayList<AbstraktRute>();
        for(int i=0; i<antruter;i++){
            if(i==10||20==i||3==i||3==i){
                ruter.add(new TilbakeTilStart(i + 1));
            }else {
                ruter.add(new VanligRute(i+1));
            }
        }

    }


}