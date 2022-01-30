package javatest;

import java.util.Scanner;

public class petizadatak<j> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite zeljeni niz");
        int[] niz = new int[10];
        for (int i = 0; i < niz.length; i++) {
            niz[i] = scanner.nextInt();


           // System.out.println(niz);
        }
    }

    public static int pavle(int c[], int b) {
        int brojac = 0;
        int j = 0;
        // zelim da ubacim funkciju j, koji ce da proverava brojeve iz unetog niza,
        // kad pronadje isti broj povecace brojac za 1;
        for (int i = 0; i < c.length; i++) {
         if (j == b)
            brojac++;
        else if (j !=b) //ovom funkcijom u nekom daljoj buducnosti bih rekao
        }
        return brojac;
    }
}

//NAPISATI FUNKCIJU koja racuna koliko se puta neki broj pojavljuje u nizu
//Proizvoljno napravite niz od 10 brojeva
//korisnik unosi broj koji zeli da prebroji u nizu
//niz je tipa int

//Primer niza {2, 12, 432, 21, 2, 7, 12, 2, 21, -2}
//Primeri ispisa u konzoli

//Unesite broj koji zelite da prbrojimo u nizu brojeva:
//2
//Broj 2 se pojavljuje 3. puta u nasem nizu brojeva
//Primer ispisa kad se unese broj koji ne postoji u nizu brojeva

//Unesite broj koji zelite da prbrojimo u nizu brojeva:
//8
//Broj 8 se ne pojavljuje u nasem nizu