import java.util.Scanner;

public class Sumadomaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2.[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n].
        System.out.println("upisite prvi broj ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int c = 0;

        for (int i = m;i <=n;i++)
        {   c = c + i;
            System.out.println("Suma brojeva je " + c);
        }
    }
}
