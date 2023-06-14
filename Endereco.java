public class Endereco {
    private int cep;
    private String rua;
    private int numero;

    public Endereco(int cep, String rua, int numero) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
