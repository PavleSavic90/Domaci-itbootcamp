package javatest;

import java.util.Scanner;

public class trecizadatak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Molim vas unesite 1. broj");
        int c = scanner.nextInt();
        int i = 0;
        int zbir = c;
    while (c != 0){
        int zbir2;
        System.out.println("Trenutni zbir je " + zbir);
        System.out.println("Molim vas unesite " + (i+2) + ". broj");
        c = scanner.nextInt();
        zbir = c + zbir;
        i++;
        }
    }
}



//Napisite program koji, koristeci WHILE petlju, racuna zbir unetih brojeva (svi brojevi su tipa int), sve dok korisnik ne unese 0
//Primer ispisa resenja:
//Molim vas unesite 1. broj
//4
//Trenutni zbir je 4
//Molim vas unesite 2. broj
//5
//Trenutni zbir je 9
//Molim vas unesite 3. broj
//0
//Uneli ste 0 Kraj programa