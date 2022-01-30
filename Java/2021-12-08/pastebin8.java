package domaci;

import java.util.Scanner;

public class pastebin8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesti vase ime");
        String ime = scanner.next();
        System.out.println("Unesite vase prezime");
        String prezime = scanner.next();
        System.out.println("Unesite vase godiste");
        int god = scanner.nextInt();
        int i = 2021;
        int rezultat = i - god - 6;

        if (rezultat <= 6) {
            System.out.println(ime + " "+ prezime + "  tek treba da zapocne obrazovanje");
        } else if (rezultat <= 12)
            System.out.println(ime + " "+ prezime + "  Vi ste " + rezultat + "  razred");
        else {
            System.out.println(ime + " "+ prezime + "  je zavrsio skolu");
            //8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
            //	"Dobrodosao u {x}. razred, {ime} {prezime}",
            //	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak
            //	ispisati jednu odgovarajucu
            //    poruku od:
            //	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"
        }
    }
}
