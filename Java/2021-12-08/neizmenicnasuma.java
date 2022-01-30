import java.util.Scanner;

public class neizmenicnasuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* 3.[Naizmenicna suma] Korisnik unosi vrednost broja n (int) sa konzole.
        Na standardni izlaz ispisati resenje izraza:
        1 - 2 + 3 - .... (+/-) n.


        */
        System.out.println("upisite prvi broj ");
        int n = scanner.nextInt();
        System.out.println("upisite drugi broj");
        int c = 0;

        for (int i=1;i<=n;i++)
        {
            if (i % 2 == 0){
            c = c+ i;
            System.out.println(c);
            }

            else if (i% 2 !=0)
            c = c -i;
        }

        System.out.println("Suma brojeva je " + c);
    }
}
