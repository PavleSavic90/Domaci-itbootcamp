package domaci;

import java.util.Scanner;

public class domaci1214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("unesite koliko brojeva hocete da ukucate");
        int n = scanner.nextInt();
        int [] niz = new int[n];
        System.out.println("unesite zeljene brojeve");
        for (int i=0; i< niz.length;i++){

            niz[i] = scanner.nextInt();

        }
        for (int i = 0; i < niz.length;i+=2){
            System.out.println(niz[i]);
        }

       // System.out.println(niz[0]);
       // System.out.println(niz[1]);
       // System.out.println(niz[2]);
       // System.out.println(niz[3]);
       // System.out.println(niz[4]);

        //for (int i = 0; i < niz.length; i++){
            //niz [i] = scanner.nextInt();
            //System.out.println(niz[i]);
        }
        }



//27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
        //Primer: [1, 2, 3, 4, 5] -> 1 3 5