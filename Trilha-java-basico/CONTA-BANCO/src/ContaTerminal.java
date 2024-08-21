import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (// Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            //Exibir as mensagens para nosso usuario
            System.out.println("Por favor, digite o número da Agência !");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o número da Conta !");
            int conta = scanner.nextInt();

            System.out.println("Por favor, digite seu nome completo !");
            scanner.nextLine(); // Consumir a linha restante
            String cliente = scanner.nextLine();

            System.out.println("Por favor, digite seu saldo de conta !");
            double saldo = scanner.nextDouble();

            // Imprimindo os dados
            String mensagem = """
                Olá %s, obrigado por criar uma conta em nosso banco, 
                sua agência é %s, conta %d e 
                seu saldo %.2f já está disponível para saque.
                """.formatted(cliente, agencia, conta, saldo);
            
            System.out.println(mensagem);
        }            
    }
}
