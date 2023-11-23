public class Main {
    public static void main(String[] args) {

        Triangolo triangolo = new Triangolo(2, 3, TipoForma.TRIANGOLO);
        triangolo.calcolaArea();

        Rettangolo rettangolo = new Rettangolo(2, 3, TipoForma.RETTANGOLO);
        rettangolo.calcolaArea();
    }
}
