package javatest;

import java.util.Scanner;
public class drugizadataksaifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo vas unesite tip vozila");
        String vozilo = scanner.next();
        System.out.println("Unesite distancu koju zelite da predjete");
        double distanca = scanner.nextInt();

        switch (vozilo) {
            case "automobil":
                vozilo.equalsIgnoreCase("automobil"); {
                    double potrosnja = distanca / 100 * 7;
                    //Kombi na 134.0 km potrosi 14.74 litara goriva
                    System.out.println("Automobil na " + distanca * 1.0 + " potrosi " + potrosnja + " litara goriva");
                    break;
                }
            case "kombi":
                vozilo.equalsIgnoreCase("kombi");
                {
                    double potrosnja = distanca / 100 * 11;
                    System.out.println("kombi na " + distanca * 1.0 + " potrosi " + potrosnja + " litara goriva");
                    break;
                }
            case "kamion":
                 vozilo.equalsIgnoreCase("kamion"); {
                    double potrosnja = distanca / 100 * 11;

                    System.out.println("Kamion na " + distanca * 1.0 + " potrosi " + potrosnja + " litara goriva");
                    break;
                }
            default:
                System.out.println("Uneli ste pogresan tip vozila");
        }
    }
}
