import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        double saldo;
        String agencia;
        String nomeCliente;

        System.out.println("Bem-vindo ao nosso banco!");
        System.out.println("Por favor, digite as informações solicitadas abaixo.");

        System.out.print("Digite seu nome: ");
        nomeCliente = ler.nextLine();
        System.out.print("Digite a agência: ");
        agencia = ler.next();
        System.out.print("Digite o número: ");
        numero = ler.nextInt();
        System.out.print("Digite o saldo: ");
        saldo = ler.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        ler.close();
    }
}

