import java.util.Scanner;

public class Sintaksa1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi duzinu zida:  " );
        double duzina = scanner.nextDouble();

        System.out.println("Unesi sirinu zida");
        double sirina = scanner.nextDouble();

        System.out.println("unesite visinu zida");
        double visina = scanner.nextDouble();


        double resenje = (duzina * visina * 2) + (sirina * visina * 2) + (sirina * duzina)  ;
        System.out.println("povrsina krecenja je " +  resenje );


    }
    }




