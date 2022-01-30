package PasteBin9;

import java.util.ArrayList;

public class Odeljenje {

    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }
    public String getOznaka() {
        return oznaka;
    }
    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }
    public ArrayList getDnevnik() {
        return dnevnik;
    }
    public void setDnevnik(ArrayList dnevnik) {
        this.dnevnik = dnevnik;
    }
    public void upisiUcenika(Ucenik u) {
        dnevnik.add(u);
    }
    public void upisiUcenika(Ucenik u, int redniBroj) {
        dnevnik.add(redniBroj, u);
    }
    public void ispisiUcenika(Ucenik u) {
        dnevnik.remove(u);
    }
    public void ispisiUcecnik(int i) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Ucenik qq : dnevnik) {
            sb.append(oznaka);
        }
        String vrati = sb.toString();
        return vrati;
    }
}