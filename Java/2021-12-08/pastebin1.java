import java.util.Scanner;

public class pastebin1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("unesite broj");
        int a = scanner.nextInt();


        if (a == 0) {
            System.out.println("vas broj je nula");
        } else if (a % 2 == 0){
            System.out.println("Vas broj je paran");
        }
        else
        {
            System.out.println("Vas broj je neparan");
        }
    }
}
