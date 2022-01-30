package javatest;

public class prvizadatak {
    public static void main(String[] args) {
        int  najveci = 0;
        int [] niz = {3, 5, 4, 11, -1, 23, 5, 43, 0, 5};
        for (int i = 0; i < niz.length;i++){
            if (najveci < niz[i]){
                najveci = niz[i];
            }
        } System.out.println("Najveci broj u nizu je " + najveci);
    }
}


//Napisite niz od 10 elemenata i koristeci FOR petlju pronadjite najveci broj u nizu
//niz je tipa int
//Primer niza {3, 5, 4, 11, -1, 23, 5, 43, 0, 5}
//Primer ispisa resenja u konzoli:
//Najveci broj u nizu je 43
