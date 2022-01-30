import java.util.Scanner;

public class pastebin2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("unesite broj");
        int n = scanner.nextInt();


        if (n == 0) {
            System.out.println("vas broj je neutralan");
        } else if (n>0){
            System.out.println("Vas broj je pozitivan");
        }
        else
        {
            System.out.println("Vas broj je negativan");
        }
    }
}
