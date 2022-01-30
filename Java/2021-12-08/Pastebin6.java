package domaci;

import java.util.Scanner;

public class Pastebin6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //6. Ispisati proizvod prvih n celih brojeva [1, n].
        System.out.println("unesite broj");
        int n = scanner.nextInt();
        int rezultat= 1;
        for (int i = 1;i <=n;i++){
            rezultat = rezultat * i;
            System.out.println(rezultat);
        }
    }
}
