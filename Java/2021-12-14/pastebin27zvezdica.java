package array;

import java.util.Scanner;

public class pastebin27zvezdica {
    public static void printerSvakiDrugi (int [] n) {
        for (int i = 0; i < n.length; i+=2) {
            System.out.println(n[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] pavle=  {2,4,6,8};
        int[] niz = new int[n];
        for (int i = 0; i < niz.length; i++) {
            niz[i] = scanner.nextInt();

        }
        printerSvakiDrugi(niz);

    }
}
//27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.