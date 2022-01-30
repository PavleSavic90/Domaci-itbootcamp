import java.util.Scanner;

public class duplifaktorijal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite ceo pozitivan broj");
        int a = scanner.nextInt();
        int i = 1;
        int f = 1;

        if (a % 2 == 0) {

            for (i = 2; i <= a; i+=2) {
                f = f * i;

            }
            System.out.println("Dupli faktorijal je" + f);
        } else if (a % 2 != 0) {

            for (i = 1; i <= a; i+=2) {
                f = f * i;

            }
            System.out.println("dupli faktorijal je " + f);
        }}}
