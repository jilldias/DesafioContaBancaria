public class ContaTerminal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        String numero = input.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = input.next();

        System.out.println("Digite seu nome e sobrenome: ");
        String nome = input.next();

        System.out.println("Saldo: ");
        String saldo = input.nextDouble();

        System.out.println("Olá \{nome}, obrigado por criar uma conta em nosso banco \n Sua agência é \{agencia}\n Conta \{numero}\n E seu saldo de \{saldo} ja está disponível para saque. ");
    }
}