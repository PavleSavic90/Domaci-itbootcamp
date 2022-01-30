package DomaciSuma;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class Suma {
    public static void main(String[] args) throws IOException {
        ExcelReader excelReader;
        excelReader = new ExcelReader("C:\\Users\\Pavle\\Desktop\\suma.xlsx");
        int suma = 0;
        for (int i = 0; i <= excelReader.getLastRow("suma"); i++) {
            int brojevi = excelReader.getIntegerData("suma", i, 0);
            suma = brojevi + suma;
            System.out.println(suma);
        }
        System.out.println(suma);
    }
}