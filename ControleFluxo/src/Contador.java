import java.util.Scanner;

import static java.lang.System.err;

public class Contador {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira o primeiro parametro: ");
        int n1 = leia.nextInt();
        System.out.println("Insira o segundo parametro: ");
        int n2 = leia.nextInt();

        try {
            contar(n1, n2);
        } catch(ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int n1, int n2) throws ParametrosInvalidosException{
        if (n1>n2) {
            throw new ParametrosInvalidosException("Erro: o primeiro parametro precisa ser menor que o segundo");
        }

        int contagem = n2 - n1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número "+i);
        }
    }
}
