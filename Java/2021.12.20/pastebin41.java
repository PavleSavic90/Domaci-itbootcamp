package domaci;

public class pastebin41 {
    public static void main(String[] args) {
        double [] nasumicnibrojevi = {1,2,4,3,5,16,78};
        System.out.println(niz(nasumicnibrojevi));
    }
    public static double niz (double[]  strahinja){
        double [] sabiranje = new double [strahinja.length];
        double racunica = 0;
        for (int i = 0; i < strahinja.length;i++){
            racunica = strahinja[i] + racunica;
        }
        double prosecna = racunica / strahinja.length;
        return prosecna;
    }

}
//41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.