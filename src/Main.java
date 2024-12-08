/*
A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area,
aggiungere un'ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima figura
 */
public class Main {
    public static void main(String[] args) {

        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(5,3);
        Triangolo triangolo = new Triangolo(7.2,9.4);

        forma.calcolaArea();
        rettangolo.calcolaArea();
        triangolo.calcolaArea();

    }
}
