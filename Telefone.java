public class Telefone {
    private int ddd;
    private int numeroCelular;

    public Telefone(int ddd, int numero) {
        this.ddd = ddd;
        this.numeroCelular = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numeroCelular;
    }

    public void setNumero(int numero) {
        this.numeroCelular = numero;
    }
}
