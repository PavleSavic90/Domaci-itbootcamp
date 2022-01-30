package domaci;

import java.util.Scanner;

public class pastebin9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //9. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz"
        // ako je deljiv sa 3, "Buzz" ako je deljiv sa 5, "Zazz" ako je deljiv sa 7 i
        // sve ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("BuzzZazz" + i);
            } else if (i % 7 == 0) {
                System.out.println("Zazz" + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz" + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz" + i);
            } else {
                System.out.println(i);
            }
        }
    }
}