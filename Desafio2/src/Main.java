import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner leia = new Scanner(System.in);
        System.out.println("============= BANCO UOL =============");
        System.out.print("Número da conta: ");
        conta.setNumeroConta(leia.nextInt());
        leia.nextLine();
        System.out.print("Agência: ");
        conta.setAgencia(leia.nextLine());
        System.out.print("Nome Completo: ");
        conta.setNomeCliente(leia.nextLine());
        System.out.print("Saldo: ");
        conta.setSaldo(leia.nextDouble());

        System.out.println("Olá "+conta.getNomeCliente()+
                ", obrigado por criar uma conta em nosso banco, sua agência é "+conta.getAgencia()+
                ", conta "+conta.getNumeroConta()+" e seu saldo "+ conta.getSaldo()+" já está disponível para saque.");
    }
}