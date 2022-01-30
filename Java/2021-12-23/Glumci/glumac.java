package Glumci;

public class glumac {

    private String imeGlumca;
    private String prezimeGlumca;
    private char pol;
    private int godine;
    private int ocena;
    boolean srbija;





    public glumac(String imeGlumca, String prezimeGlumca, char pol, int godine, int ocena,boolean srbija) {
        this.imeGlumca = imeGlumca;
        this.prezimeGlumca = prezimeGlumca;
        this.pol = pol;
        this.godine = godine;
        this.ocena = ocena;
        this.srbija = srbija;

        if (pol == 'm'){
            System.out.println("Glumac je musko");}
            else if (pol=='z'){
            System.out.println("Glumica");
        }
            else {
            System.out.println("Niste uneli dobro pol glumca");
        }


            if (srbija){
                System.out.println("Glumac je iz srbije");
            }
            else{
                System.out.println("glumac nije iz srbije");
            }

            if (ocena < 0){
                System.out.println("Ne mozete oceniti brojem ispod 0");
            }
            else if (ocena > 10){

                System.out.println("Ne mozete oceniti preko 10");
            }
            else {
                System.out.println("Vasa ocena je " + ocena);
            }
    }



    public String getImeGlumca() {
        return imeGlumca;
    }

    public void setImeGlumca(String imeGlumca) {
        this.imeGlumca = imeGlumca;
    }

    public String getPrezimeGlumca() {
        return prezimeGlumca;
    }

    public void setPrezimeGlumca(String prezimeGlumca) {
        this.prezimeGlumca = prezimeGlumca;
    }

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(imeGlumca);
        sb.append("\n");
        sb.append(prezimeGlumca);
        sb.append("\n");
        sb.append(pol);
        sb.append("\n");
        sb.append(godine);
        sb.append("\n");
        sb.append(ocena);

        String napravljenString = sb.toString();
        return napravljenString;
    }

}
