public class Triangolo extends Rettangolo{

    double area = (altezza * larghezza)/2;

    public Triangolo(double altezza, double larghezza) {
        super(altezza, larghezza);
    }

    @Override
    public void calcolaArea() {
        System.out.println("L'area del  Triangolo è: "+ area);
    }
}
