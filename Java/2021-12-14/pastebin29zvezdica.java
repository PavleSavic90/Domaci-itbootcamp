package domaci;

public class pastebin29zvezdica {
    public static void main(String[] args) {
        int [] niz = {1, 2, 3, 4, 5, 6, 7, 8};
    stampac(niz);
    }
    public static void stampac (int []n){
        for (int i= n.length-1; i >0 ;i-=3){
            System.out.println(n[i]);
        }
    }
}




//29. -//-. Ispisati svaki treci element u obrnutom redosledu.
//Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
//29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.