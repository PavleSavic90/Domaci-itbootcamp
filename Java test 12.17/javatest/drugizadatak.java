package javatest;

import java.util.Scanner;

public class drugizadatak {
    public static void main(String[] args) {

        //ja se izvinjavam i ne umem da citam zadatak (ili bilo kakva slova ocigledno) pre nego sto krenem da radim
        // uradio sam drugi kako treba kroz switch, ovo da se ne baci

        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo vas unesite tip vozila");
        String vozilo = scanner.next();
        System.out.println("Unesite distancu koju zelite da predjete");
        double distanca = scanner.nextInt();
        if (vozilo.equalsIgnoreCase("automobil")) {
            double potrosnja = distanca / 100 * 7;
            //Kombi na 134.0 km potrosi 14.74 litara goriva
            System.out.println("Automobil na " + distanca * 1.0 + " potrosi " + potrosnja + " litara goriva");
        } else if (vozilo.equalsIgnoreCase("kombi")) {
            double potrosnja = distanca / 100 * 11;

            System.out.println("kombi na " + distanca * 1.0 + " potrosi " + potrosnja + " litara goriva");
        } else if (vozilo.equalsIgnoreCase("kamion")) {
            double potrosnja = distanca / 100 * 11;

            System.out.println("Kamion na " + distanca * 1.0 + " potrosi " + potrosnja + " litara goriva");
        } else {
            System.out.println("Uneli ste pogresan tip vozila");
        }
    }
}





//Napisati program koji racuna potrosnju goriva
//Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva biti potroseno
//Motor trosi 5 litara goriva na 100 kilometara,
//Automobil trosi 7 litara na 100 kilometara,
//Kombi trosi 11 litara na 100km,
//Kamion trosi 15 litara na 100km
//Nakon sto korisnik unese tip vozila treba pokrenuti ostatak programa kroz switch

//Primeri ispisa u konzoli:
//Molim vas unesite tip vozila:
//Kombi
//Molim vas unesite distancu u kilometrima:
//134
//Kombi na 134.0 km potrosi 14.74 litara goriva
//Primer ispisa kad se unese pogresno vozilo

//Molim vas unesite tip vozila:
//Tenk
//Molim vas unesite distancu u kilometrima:
//133
//Uneli ste pogresan tip vozila