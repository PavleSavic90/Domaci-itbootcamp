import java.util.Scanner;

public class DomaciFizzBuzz {
    public static void main(String[] args) {


   /*     Za uneti celobrojni nenegativan broj n, ispisati za sve brojeve od 1 do
    i zakljucno sa n nisku "Fizz" ako je on deljiv sa 3, nisku "Bu
    zz" ako je on deljiv sa 5, a nisku
        "FizzBuzz" ako je on deljiv i sa 3 i sa 5*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj");
        int n = scanner.nextInt();
        System.out.println("Broj je " + n);
        System.out.println("Ukucajte dokle zelite da znate rezultat");



        for (int i = 1 ; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 )
            {
                System.out.println("FizzBuzz" + i);
        }
            else if (i % 5 == 0) {
                System.out.println("Buzz" + i);
            }
                else if (i % 3 == 0) {
                    System.out.println("fizz" + i);


                }
                else {
                System.out.println(i + " ");
            }
        }
    }
}
