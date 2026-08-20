package fase1.logica;

import java.util.Scanner;

public class Desafio28MaiorEMenorDoVetor {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("===== CADASTRO DE NÚMEROS =====");
            System.out.println("Quantos números deseja informar? ");
            int num1 = sc.nextInt();

            int[] vetor = new int[num1];
            int cont = 0;
            int maior = 0;
            int menor = 0;

            for (int i = 0; i < num1; i++) {
                cont++;
                System.out.println("Número " + cont + ": ");
                int num2 = sc.nextInt();
                vetor[i] = num2;
            }

            for (int i = 0; i < num1; i++) {
                System.out.println(vetor[i]);

                if (i == 0) {
                    maior = vetor[i];
                    menor = vetor[i];
                }

                if (vetor[i] < menor) {
                    menor = vetor[i];
                }

                if (vetor[i] > maior) {
                    maior = vetor[i];
                }

                
            }
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);


        }

    }

}
