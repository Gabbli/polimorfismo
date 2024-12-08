public class Rettangolo {
    double altezza;
    double larghezza;


    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }


    public void calcolaArea() {
        double area = altezza * larghezza;
        System.out.println("L'area del Rettangolo è: "+ area);
    }
}
