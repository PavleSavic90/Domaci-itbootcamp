import java.util.Scanner;
public class Grananja3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Upisite mesec");
        String mesec = scanner.next();


        System.out.println("Upisite godinu");
        int a = scanner.nextInt();

        {
            System.out.println(" godina je =" + a);
        }
        if (mesec.equalsIgnoreCase("januar")) {
            System.out.println("31 dana");
        } else if (mesec.equalsIgnoreCase("mart")) {
            System.out.println("31 dana");
        } else if (mesec.equalsIgnoreCase("april")) {
            System.out.println("30 dana");
        } else if (mesec.equalsIgnoreCase("maj")) {
            System.out.println("31 dana");
        } else if (mesec.equalsIgnoreCase("jun")) {
            System.out.println("30 dana");
        } else if (mesec.equalsIgnoreCase("jul")) {
            System.out.println("31 dana");
        } else if (mesec.equalsIgnoreCase("avgust")) {
            System.out.println("31 dana");
        } else if (mesec.equalsIgnoreCase("septembar")) {
            System.out.println("30 dana");
        } else if (mesec.equalsIgnoreCase("oktobar")) {
            System.out.println("31 dana");
        } else if (mesec.equalsIgnoreCase("novembar")) {
            System.out.println("30 dana");
        } else if (mesec.equalsIgnoreCase("decembar")) {
            System.out.println("31 dana");
        }
        if (a % 4 == 0 && mesec.equalsIgnoreCase("februar")) {
            System.out.println("Mesec ima 29 dana");
        } else if (a % 4 != 0 && mesec.equalsIgnoreCase("februar")) {
            System.out.println("Mesec ima 28 dana");
        }
    }
}


