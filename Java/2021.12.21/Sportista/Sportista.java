package Sportista;

public class Sportista {
    private String imeprezime;
    private String sport;
    private String klub;
    private int dres;

    public Sportista(String imeprezime, String sport, String klub, int dres) {
        this.imeprezime = imeprezime;
        this.sport = sport;
        this.klub = klub;
        this.dres = dres;
    }
    public String getImeprezime() {
        return imeprezime;
    }
    public String getSport() {
        return sport;
    }
    public String getKlub() {
        return klub;
    }
    public int getDres() {
        return dres;
    }
    public void setDres(int dres) {
        this.dres = dres;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(imeprezime);
        sb.append("\n");
        sb.append("Igra sport ");
        sb.append(sport);
        sb.append("\n");
        sb.append("trenutno je u klubu ");
        sb.append(dres);
        sb.append("\n");
        sb.append("Dress je ");
        sb.append(dres);
        sb.append("\n");
        String posalji = sb.toString();
        return posalji;
    }
}
