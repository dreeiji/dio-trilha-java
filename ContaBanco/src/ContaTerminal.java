import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //TODO: Exibir as mensagens para o usuário
        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        //Obter pelo scanner o valores digitados no terminal
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        //Nome do cliente
        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        //Saldo
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        

        //Exibir a conta criada
        System.out.println("Conta criada com sucesso!");
        System.out.println("Número da conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo da conta: " + saldo);
    }
}
