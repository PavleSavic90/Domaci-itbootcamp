package JavaTest;

import java.util.ArrayList;

public class Korisnik {
   public static int nextId = 1;
    private int id;
    private String ime;
    private String prezime;
    private Broj broj;
    private ArrayList<Usluga> nizUsluga;


    public Korisnik(String ime, String prezime, Broj broj) {
        this.id = id;
        this.ime = ime;
        this.prezime= prezime;
        this.broj = broj;
        this.nizUsluga = nizUsluga;
        nextId ++;

    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Broj getBroj() {
        return broj;
    }

    public void setBroj(Broj broj) {
        this.broj = broj;
    }

    public ArrayList<Usluga> getNizUsluga() {
        return nizUsluga;
    }

    public void setNizUsluga(ArrayList<Usluga> nizUsluga) {
        this.nizUsluga = nizUsluga;
    }
    public void posaljiPoruku (){
        nizUsluga.add();
//- napisati metodu posaljiPoruku, koja prima broj na koji treba posalti poruku i tekst poruke.
// Metoda kreira poruku i stavlja je u niz istorija usluga.
    }
    public void pozovi(){

    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" "). append(prezime).append(" ").append(broj);
        for (Usluga u : nizUsluga){
           sb.append(u);
           sb.append("\n");
        }
        return sb.toString();
    }
}
