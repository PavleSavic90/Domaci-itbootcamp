package JavaTest;

public class Broj {
    private String kodDrzave;
    private String pozivniBroj;
    private int broj;
    private boolean fiksniBroj; //true ako je broj fixni, false ako je mobilni

    public Broj(String kodDrzave, String pozivniBroj, int broj, boolean fiksniBroj) {
        this.kodDrzave = kodDrzave;
        this.pozivniBroj = pozivniBroj;
        this.broj = broj;
        this.fiksniBroj = fiksniBroj;
    }

    public String getKodDrzave() {
        return kodDrzave;
    }

    public void setKodDrzave(String kodDrzave) {
        this.kodDrzave = kodDrzave;
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }

    public void setPozivniBroj(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public boolean isFiksniBroj() {
        return fiksniBroj;
    }

    public void setFiksniBroj(boolean fiksniBroj) {
        this.fiksniBroj = fiksniBroj;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("+").append(kodDrzave).append(pozivniBroj).append(broj);

        return sb.toString();
    }

    public static boolean proveriDaLiStringSadrziSamoNumerike(String h){

        return true;
    }
    public static boolean proveriBroj(String kodDrzave, String pozivniBroj, int broj ){
        //Kod drzave ne sme biti null i
        boolean  b = false;
        if (kodDrzave != null && (kodDrzave.length() == 3)){
//            System.out.println("validan i 3 broja");
            if (pozivniBroj != null && pozivniBroj.length() == 2){
//            System.out.println("validan i 2 broja");
            if ( broj > 999999 && broj < 9999999) {
                System.out.println();
                b = true;
            }}

        }
        else {
            System.out.println("Niste uneli dobar broj");
        }
        return b;
    }
}
//Napisati:
//        - konstruktor (sva polja su obavezna)
//        - getter i setter metode
//        - napisati toString metodu, format je:
//        +kodDrzave pozivniBroj broj
//        na primer
//        +381 63 1234567
