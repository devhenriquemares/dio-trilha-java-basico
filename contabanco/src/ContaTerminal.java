import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor insira o número de sua conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor insira sua agência");
        String agencia = scanner.next();

        System.out.println("Por favor insira seu nome");
        String nome = scanner.next();

        System.out.println("Por favor insira seu saldo atual");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
