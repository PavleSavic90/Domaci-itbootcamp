package PasteBin9;

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList <Integer> ocene;

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }
    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene= new ArrayList<Integer>();
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public ArrayList getOcene() {
        return ocene;
    }
    public void setOcene(ArrayList<Integer>ocene) {
        this.ocene = ocene;
    }
    public double prosecnaOcena (ArrayList<Integer>ocene){
        double suma = 0;
        for (int i: ocene){
            suma = i + suma;
        }
        return suma/ ocene.size();
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(ime);
        sb.append(" i ");
        sb.append(prezime);
        sb.append("Ima ocene:");
        sb.append("\n");
        sb.append(ocene);
        String stampa = sb.toString();

        return stampa;

    }
}
