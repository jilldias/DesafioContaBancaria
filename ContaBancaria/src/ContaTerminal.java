import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int numero = input.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = input.next();

        System.out.println("Digite seu nome: ");
        String nome = input.next();

        System.out.println("Saldo: ");
        Double saldo = input.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco! Sua agência é  " + agencia + " Conta " + numero + " E seu saldo de " + saldo + " ja está disponível para saque. ");

    }
}