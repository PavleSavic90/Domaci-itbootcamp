package domaci;

import java.util.Scanner;

public class pastebin29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] niz = new int[n];

        for (int i= 0;i < niz.length;i++){
            niz[i] = scanner.nextInt();

        }




        for (int i= niz.length;i >= 1; i-=3){

            System.out.println(i);
        }


    }
}
//29. -//-. Ispisati svaki treci element u obrnutom redosledu.
//Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
//29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.