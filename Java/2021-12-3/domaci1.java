import java.util.Scanner;

public class domaci1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("unesite prvi broj:  ");
        int a = scanner.nextInt();

        System.out.println("drugi broj:  ");
        int b = scanner.nextInt();

        System.out.println("Unesite da li zelite da li zelite da saberete, oduzmete, podelite ili pomnozite : ");

        String funkcija = scanner.next();
         if (funkcija.equals("podeli")) {
            System.out.println("Vas rezultat je " + (a / b));
        } else if (funkcija.equals("saberi")) {
            System.out.println("Vas rezultat je  " + (a + b));
        } else if (funkcija.equals("oduzmi")) {
            System.out.println("Vas rezultat je " + (a - b));
        } else if (funkcija.equals("pomnozi")) {
            System.out.println("Vas rezultat je " + (a * b));
        }
        else if (funkcija.equals("ostatak")) {
            System.out.println("Vas rezultat je " + (a % b));
        }

    }
}






