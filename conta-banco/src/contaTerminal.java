import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número da sua conta: ");
        var numeroConta = scan.nextInt();
        scan.nextLine(); 
        System.out.println("\nDigite o número da sua agência: ");
        var numeroAgencia = scan.nextLine();
        System.out.println("\nDigite o seu nome: ");
        var nome = scan.nextLine();
        System.out.println("\nDigite o seu saldo: ");
        var saldo = scan.nextFloat();
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponivel para saque", nome, numeroAgencia, numeroConta, saldo);
        scan.close();
    }
}