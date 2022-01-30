package JavaTest;

public class TestTest {
    public static void main(String[] args) {
        Broj b1 = new Broj("381", "64", 3318458,true);
        Broj b2 = new Broj("381", "64", 3, true);
        Broj b3 = new Broj("381", "63", 4145235, true);

        Korisnik k1 = new Korisnik("pavle", "savic",b3);
        //Poziv p4 = new Poziv()
        //Poruka p1 = new Poruka("b1", "b2","asdasdasda");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(k1);
    }
}
