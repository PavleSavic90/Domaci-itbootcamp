package domaci;


import java.util.Scanner;

public class pastebin42 {
    public static void main(String[] args) {
        String [] imena = {"Mirko", "Milica", "Petar", "Strahinja", "Marija", "Stefan", "Petar"};



        
        System.out.println(strahinja(imena));


        }

    public static int strahinja (String [] asdf) {
        int brojac=0;
        int brojac2=0;
        for (int i = 0; i < asdf.length;i++){
           if (asdf[i].equals("Marija")){
               brojac++;
           }
           else if (asdf[i].equals("Petar")){
               brojac2++;
           }
        }
        return brojac;//, brojac2;
        // ne umem da vratim drugi int, pokusao sam sa zarezom, nece
    }



}


//42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".