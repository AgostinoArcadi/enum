public class Forma {
    private int base;

    private int altezza;

    public final TipoForma tipo;

    public Forma(int base, int altezza, TipoForma tipo) {
        this.base = base;
        this.altezza = altezza;
        this.tipo = tipo;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public TipoForma getTipo() {
        return tipo;
    }

    public void calcolaArea() {
        switch(tipo) {
            case TRIANGOLO:
                System.out.println((base * altezza) / 2);
                break;
            case RETTANGOLO:
                System.out.println(base * altezza);
                break;
            default:
                System.out.println("Questa forma non esiste");
        }
    }

}
