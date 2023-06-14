import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<ContaBancaria> listaContas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nubank");
        exibirOpcoes();

        int resposta = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        while (resposta != 4) {
            switch (resposta) {
                case 1:
                    cadastrarCliente(listaContas, scanner);
                    break;
                case 2:
                    listarClientes(listaContas);
                    break;
                case 3:
                    excluirCliente(listaContas, scanner);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("\nO que deseja fazer agora?");
            exibirOpcoes();
            resposta = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
        }

        System.out.println("Fechando o programa...");
        scanner.close();
    }

    public static void exibirOpcoes() {
        System.out.println("========================");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Listar Clientes");
        System.out.println("3 - Excluir Cliente");
        System.out.println("4 - Sair do programa");
        System.out.print("Escolha uma opção: ");
    }

    public static void cadastrarCliente(List<ContaBancaria> listaContas, Scanner scanner) {
        System.out.println("Informe os dados do usuário:");
        System.out.println("Dados da conta bancária:");
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Dados do cliente:");
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Endereço:");
        System.out.print("CEP: ");
        int cep = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        System.out.print("Número da casa: ");
        int numeroCasa = scanner.nextInt();

        System.out.println("Telefone:");
        System.out.print("DDD: ");
        int ddd = scanner.nextInt();
        System.out.print("Número: ");
        int numeroTelefone = scanner.nextInt();

        ContaBancaria contaBancaria = new ContaBancaria(numeroConta, saldo,
                new Cliente(cpf, nome,
                        new Endereco(cep, rua, numeroCasa),
                        new Telefone(ddd, numeroTelefone)));

        listaContas.add(contaBancaria);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static void listarClientes(List<ContaBancaria> listaContas) {
        System.out.println("Listando os clientes:");
        for (ContaBancaria conta : listaContas) {
            System.out.println(conta);
            System.out.println("");
        }
    }

    public static void excluirCliente(List<ContaBancaria> listaContas, Scanner scanner) {
        System.out.println("Informe o número da conta do cliente que deseja excluir:");
        int numeroContaExcluir = scanner.nextInt();
        boolean contaEncontrada = false;

        for (ContaBancaria conta : listaContas) {
            if (conta.getNumeroConta() == numeroContaExcluir) {
                listaContas.remove(conta);
                contaEncontrada = true;
                System.out.println("Cliente removido com sucesso!");
                break;
            }
        }

        if (!contaEncontrada) {
            System.out.println("Cliente não encontrado!");
        }
    }
}
