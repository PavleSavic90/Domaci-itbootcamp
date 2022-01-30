package domaci;

import java.util.Scanner;

public class domaci30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] niz = {1,2,3,4,5,6,7};

        System.out.println("Upisite brojeve u nizu");

        int mnozenje = 1;
        for (int i = 0; i < niz.length; i++){

            System.out.println(niz[i]);
            mnozenje = niz[0] * niz[1]  * niz[2]  * niz[3] * niz[4]  * niz[5]  * niz[6];
        }
        System.out.println(mnozenje);
    }
}

//30. -//-. Izracunati proizvod elemenata tog niza.
       // Primer: [2, 4] -> 8
        //30* Napisati funkciju koja racuna proizvod elemenata zadatog niza.