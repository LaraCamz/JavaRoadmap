package fase1.logica;

import java.util.Scanner;

public class Desafio31MediaNumeroVetor {

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
            double soma = 0;

            for (int i = 0; i < num1; i++) {
                System.out.println("Número " + cont + ": ");
                int num2 = sc.nextInt();
                vetor[i] = num2;
                cont++;
            }
            System.out.println();
            System.out.println("===== RESULTADO =====");
            System.out.println();
            System.out.println("Números: ");
            for (int a = 0; a < num1; a++) {
                System.out.println(vetor[a]);
                soma += vetor[a];

            }
            System.out.println();
            System.out.println("Soma: " + soma);
            double media = soma / num1;
            System.out.printf("Média: %.1f", media);

        }
    }

}
