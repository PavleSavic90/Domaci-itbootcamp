package JavaTest;

public class Poruka extends Usluga {
    private String tekstPoruke;

    public Poruka(Broj brojOd, Broj brojKa, String tekstPoruke) {
        super(brojOd, brojKa);
        this.tekstPoruke = tekstPoruke;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getBrojOd()).append(getBrojKa()).append(tekstPoruke);
        return sb.toString();
    }

    @Override
    public double cenaUsluge() {
        double cena = 0;
        if (getBrojOd() != null && getBrojKa() != null && getBrojOd().equals(getBrojKa()) && brojOd.isFiksniBroj() && brojKa.isFiksniBroj()) {
            cena += 3;
        } else {
            System.out.println(" Nije moguce poslati poruku");
        }
        return cena;
        //- nadjacati metodu cena usluge. Metoda vraca koliko je cena slanja poruke sa brojOd na brojKa.
        //	Cena poruke ukoliko ju je moguce poslati je 3 dinara, ukoliko je nije moguce poslati cena je 0 dinara.
        //	Poruku je moguce poslati ako
        //		- brojOd nije jednak null
        //		- brojKa nije jednak null i
        //		- brojOd i brojKa nisu jednaki medjusobno i
        //		- brojOd nije fiksni broj i
        //		- brojKa nije fiksni broj

    }
}
