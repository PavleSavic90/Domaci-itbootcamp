package domaci;

public class trougao {


    double stranicaA;
    double stranicaB;
    double stranicaC;

    public trougao(double stranicaA, double stranicaB, double stranicaC) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
    }


    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
    }

    public double obim(){
        double obim = stranicaA+ stranicaB+ stranicaC;
        return obim;
    }
    public double povrsina() {
        double poluobim = (stranicaA + stranicaB + stranicaC) / 2;
        double povrsina = poluobim * (poluobim - stranicaA) * (poluobim - stranicaB) * (poluobim - stranicaC);
        double povrsina1 = Math.sqrt(povrsina);
        return povrsina1;

    }
}
