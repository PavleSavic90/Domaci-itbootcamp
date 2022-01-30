import java.util.Scanner;

public class horoskop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("unesite mesec u kom ste rodjeni");
        int m = scanner.nextInt();
        System.out.println("unesite dan kad ste rodjeni");
        int d = scanner.nextInt();
        String horoskop;
        if (m == 3 && d <= 20) {
            System.out.println("Vas horoskpski znak je riba");

        } else if (m == 2 && d >= 20) {
            System.out.println(" Vas horoskopski znak je riba");
        } else if (m == 2 && d < 20) {
            System.out.println("Vas horoskopski znak je Vodolija");
        } else if (m == 1 && d >= 21) {
            System.out.println("Vas horoskopski znak je Vodolija");
        } else if (m == 1 && d <= 20) {
            System.out.println("Vas horoskopski znak je Jarac");
        } else if (m == 12 && d <= 22) {
            System.out.println("Vas horoskopski znak je Jarac");
        } else if (m == 12 && d < 22) {
            System.out.println("Vas horoskopski znak je Strelac");
        } else if (m == 11 && d >= 23) {
            System.out.println("Vas horoskopski znak je Strelac");
        } else if (m == 11 && d <= 22) {
            System.out.println("Vas horoskopski znak je Skorpija");
        } else if (m == 10 && d >= 24) {
            System.out.println("Vas horoskopski znak je Skorpija");
        } else if (m == 10 && d <= 23) {
            System.out.println("Vas horoskopski znak je Vaga");
        } else if (m == 9 && d >= 23) {
            System.out.println("Vas horoskopski znak je Vaga");
        } else if (m == 9 && d <= 22) {
            System.out.println("Vas horoskopski znak je Devica");
        } else if (m == 8 && d >= 23) {
            System.out.println("Vas horoskopski znak je Devica");
        } else if (m == 8 && d < 23) {
            System.out.println("Vas horoskopski znak je Lav");
        } else if (m == 7 && d >= 23) {
            System.out.println("Vas horoskopski znak je Lav");
        } else if (m == 7 && d <= 22) {
            System.out.println("Vas horoskopski znak je Rak");
        } else if (m == 6 && d >= 22) {
            System.out.println("Vas horoskopski znak je Rak");
        } else if (m == 6 && d <= 21) {
            System.out.println("Vas horoskopski znak je Blizanci");
        } else if (m == 5 && d >= 22) {
            System.out.println("Vas horoskopski znak je Blizanci");
        } else if (m == 5 && d <= 21) {
            System.out.println("Vas horoskopski znak je Bik");
        } else if (m == 4 && d >= 21) {
            System.out.println("Vas horoskopski znak je Bik");
        }
    }
}