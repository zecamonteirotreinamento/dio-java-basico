import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            String nomeCliente;
            String numeroAgencia;
            Integer numeroConta;
            Double saldo;

            System.out.print("Digite o nome do cliente: ");
            nomeCliente = scanner.nextLine();
            System.out.print("Por favor, digite o número da Agência: ");
            numeroAgencia = scanner.nextLine();
            System.out.print("Por favor, digite o número da conta: ");
            numeroConta = scanner.nextInt();
            System.out.print("Por favor, digite o saldo: ");
            saldo = scanner.nextDouble();

            System.out.println("Olá " 
                                + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                                + numeroAgencia + ", conta " + numeroConta + " e seu saldo "
                                + saldo + " já está disponível para saque.");

            scanner.close();

    }
}
