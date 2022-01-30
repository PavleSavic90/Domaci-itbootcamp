package JavaTest;

public class Poziv extends Usluga{
    private int trajanjeUSekundama;

    public Poziv(Broj brojOd, Broj brojKa, int trajanjeUSekundama) {
        super(brojOd, brojKa);
        this.trajanjeUSekundama = trajanjeUSekundama;
    }


    public int getTrajanjeUSekundama() {
        return trajanjeUSekundama;
    }

    public void setTrajanjeUSekundama(int trajanjeUSekundama) {
        this.trajanjeUSekundama = trajanjeUSekundama;
    }

    @Override
    public double cenaUsluge() {
        double cena = 0;
        int minut = trajanjeUSekundama / 60;
        if (getBrojOd() !=null && getBrojKa() != null && getBrojOd()!= getBrojKa())
        {

            cena = minut * 10;
            return cena;
        }
        else {
            System.out.println("0 minuta");
        }

        return cena;
    }
}
//
// nadjacati metodu cena usluge. Metoda vraca kolika je cena razgovora koji je inicirao brojOd ka brojKa.
//    Cena razgovora ukoliko ga je moguce obaviti je 10 dinara za svaki zapoceti minut
//    (npr ako je trajanje u sekundama 122, to je 2 minuta i 2 sekunde, odnosno 2 cela minuta i zapocet treci, cena je 3*10=30 dinara).
//    Ukoliko nije moguce obaviti poziv cena je 0 dinara.
//        Poziv je moguce obaviti ako
//        - brojOd nije jednak null
//        - brojKa nije jednak null i
//        - brojOd i brojKa nisu jednaki medjusobno