public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    public ContaBancaria(int numeroConta, double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(int valor) {
        this.saldo += valor;
    }

    public void sacar(int valor) {
        if (valor > saldo) {
            System.out.println("Você não possui saldo!");
        } else {
            this.saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "Informações do cliente: \n" + this.cliente;
    }
}
