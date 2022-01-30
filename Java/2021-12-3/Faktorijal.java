import java.util.Scanner;

public class Faktorijal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite ceo pozitivan broj");
        int a = scanner.nextInt();
        int i = 1;
        int f = 1;


        for (i= 1; i<=a;i++){
            f = f * i;

        }
        System.out.println("Faktorijal broja " + a + " je: " + f);

    }
}
 /*Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1.
Dakle, npr:
5! = 5 * 4 * 3 * 2 * 1 = 120
3! = 3 */