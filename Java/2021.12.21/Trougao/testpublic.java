package domaci;

import java.util.Scanner;

public class testpublic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite stranicu A");
        double a = scanner.nextDouble();
        System.out.println("Unesite stranicu B");
        double b = scanner.nextDouble();
        System.out.println("Unesite stranicu C");
        double c = scanner.nextDouble();
        trougao h = new trougao(a,b,c);
        System.out.println("Obim troulgla je " + h.obim());


        System.out.println("Povrsina troulga je " + h.povrsina());


    }
}
