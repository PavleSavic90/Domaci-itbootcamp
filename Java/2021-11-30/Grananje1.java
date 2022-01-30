import java.util.Scanner;

public class Grananje1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Grananja1: Napisati program koji proverava da li je uneti broj paran.
        // Ukoliko jeste, program treba da ispise poruku: Broj je paran!
        // Ukoliko nije, program treba da ispise poruku: Broj je neparan!
        System.out.println("Unesite broj: ");
        double a = scanner.nextDouble();


        if (a % 2 == 0) {
            System.out.println("vas broj je paran");

        } else {
            System.out.println("vas broj nije paran");
        }
    }
}

