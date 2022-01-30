package Automobill;

import Osoba.Osoba;

public class TestAutomobill {
    public static void main(String[] args) {
        Osoba milan = new Osoba("Milan", "Ninkovic", 1901, 189.2);


        Automobill fica = new Automobill("Fica", "f150", 140,milan);

        System.out.println(fica);





    }
}
