public class Triangolo extends Rettangolo{


    public Triangolo(double altezza, double larghezza) {
        super(altezza, larghezza);
    }

    @Override
    public void calcolaArea() {
        double area = (altezza * larghezza)/2;
        System.out.println("L'area del Triangolo è: "+ area);
    }
}
