package Automobill;

import Osoba.Osoba;

public class Automobill {
    private String marka;
    private String model;
    private int serijskiModel;
    private Osoba vlasnik;




    public Automobill(String marka, String model, int serijskiModel, Osoba vlasnik) {
        this.marka = marka;
        this.model = model;
        this.serijskiModel = serijskiModel;
        this.vlasnik = vlasnik;
    }

    public Automobill(String marka, String model, int serijskiModel) {
        this.marka = marka;
        this.model = model;
        this.serijskiModel = serijskiModel;
        this.vlasnik = null;

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerijskiModel() {
        return serijskiModel;
    }

    public void setSerijskiModel(int serijskiModel) {
        this.serijskiModel = serijskiModel;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;

    }


    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Vas automobil je marke ");
        sb.append(marka);
        sb.append("\n");
        sb.append("model ");
        sb.append(model);
        sb.append("\n");
        sb.append("Njegov serijski broj je ");
        sb.append(serijskiModel);
        sb.append("\n");

        if (vlasnik==null){
            sb.append("Vase vozilo nema vlasnika");
        }
        else {
            sb.append("Njegov vlasnik je ");
            sb.append(vlasnik.getPrezime());
            sb.append(" ");
            sb.append(vlasnik.getIme());
        }


        return sb.toString();
        }
    }

    //Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku
    //Napisati klasu Voznja iz koje ce program moci da se pokrene.
    // U njoj ce se kreirati najmanje dva automobila. Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.

//vozilo  - Napisati klasu Automobil. Automobil ima
//1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
//2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
//3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
