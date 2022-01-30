import java.util.Scanner;

public class pastebin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 3. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.

         */
        System.out.println("Upisite vas broj:");
        int n = scanner.nextInt();

        for (int i = 0;i <=n; i++)

            System.out.println(i);


    }
}
