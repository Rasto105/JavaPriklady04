package ulohy;

/*
Popis programu.
        Ako bude program fungovať z pohľadu používateľa: Program ho vyzve otázkou: “Zadaj známku slovne (výborný, chválitebný, dobrý, dostatočný, nedostatočný). Program bude od používateľa čakať textovú odpoveď v “konzole”. Odpoveď bude alikvótna číselná známka, ktorú program vypíše.
        Program bude ďalej pokračovať vypísaním otázky na zadanie slovnej známky, kým používateľ nepreruší program zadaním slova: koniec
        Program po zadaní koniec ukončí svoju činnosť a nevypíše nič.
*/
import java.text.Normalizer;
import java.util.Scanner;

public class CiselnePriradenieTextovejZnamke {

    public static String stripAccents(String s)
    {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Inicializacia skeneru pre pouzivatelsky vstup

        System.out.println("Prosím zadaj textovú známku (výborný, chválitebný, dobrý, dostatočný, nedostatočný): ");
        String vstupnaHodnota = sc.nextLine(); // Priamy pouzivatelsky vstup, vidiet v konzole. Na nacitanie String musime pouzit nextLine

        String vstupnaTextovaZnamka = stripAccents(vstupnaHodnota).toLowerCase(); // Odstranenie diakritiky a konverzia textu na male pismena
        //System.out.println(vstupnaTextovaZnamka);

        switch (vstupnaTextovaZnamka) {
            case ("vyborny"):
                System.out.println(1);
                break;
            case ("chvalitebny"):
                //System.out.println(2);
                System.out.println(2);
                break;
            case("dobry"):
                System.out.println(3);
                break;
            case("dostatocny"):
                System.out.println(4);
                break;
            case("nedostatocny"):
                System.out.println(5);
                break;
            default:
                System.out.println("Neznámy vstup!");
        }


    }
}
