package fase1.logica;

import java.util.Scanner;

public class Desafio32ProcurandoNumeroVetor {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Quantidade: ");
            int num1 = sc.nextInt();
            if (num1 <= 0) {
                System.out.println("Erro: O número deve ser maior que 0.");
                return;
            }

            int[] vetor = new int[num1];
            int cont = 1;
            int numEncontrado = 0;

            for (int i = 0; i < num1; i++) {
                System.out.print("Número " + cont + " : ");
                int num2 = sc.nextInt();
                vetor[i] = num2;
                cont++;
            }

            System.out.println("Qual número deseja procurar? ");
            int numProcurado = sc.nextInt();

            for (int a = 0; a < num1; a++) {
                if (vetor[a] == numProcurado) {
                    System.out.println("Número encontrado!");
                    return;

                }
            }

            System.out.println("Número não encontrado.");

        }

    }

}
