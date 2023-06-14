public class Cliente {
    private String cpf;
    private String nome;
    private Endereco endereco;
    private Telefone telefone;

    public Cliente(String cpf, String nome, Endereco endereco, Telefone telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "CPF: " + this.cpf +
                "\nNome: " + this.nome +
                "\nTelefone: (" + this.telefone.getDdd() + ") " + this.telefone.getNumero() +
                "\nEndereço: CEP - " + this.endereco.getCep() + 
                "\nRua -  " + this.endereco.getRua() +
                "\nNúmero - " + this.endereco.getNumero();

    }
}
