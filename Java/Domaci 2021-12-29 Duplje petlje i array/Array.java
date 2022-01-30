package Domaci1229;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList <String> igrice = new ArrayList<String>();
        igrice.add("Warcraft 3");
        igrice.add("Diablo 2");
        igrice.add("Titan quest 2");
        igrice.add("Morrowind");
        igrice.add("Gothic 2: Night of the raven");
        System.out.println("Treci element niza je: ");
        System.out.print(igrice.get(2));
        igrice.set(0, "Warcraft 3, Frozen Throne");
        System.out.println(igrice.get(0));

        igrice.remove(4);
        System.out.println("Vasa lista je velicine " + (igrice.size() +1) );
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Vasa lista u novoj petlji izgleda ovako");




        for (String rawr : igrice){
            System.out.println(rawr);
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Vasa lista u staroj petlji izgleda ovako");


        for (int i = 0; i < igrice.size();i++){

            System.out.println(igrice.get(i));


        }

    }
}




//Kreirajte array listu nekog vaseg interesovanje (npr sport)
//-u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
//-iz liste dohvatite 3. element liste i ispisite
//-promenite naziv prvog elementa
//-uklonite 5. element
//-ispisite velicinu vase liste
//-pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste