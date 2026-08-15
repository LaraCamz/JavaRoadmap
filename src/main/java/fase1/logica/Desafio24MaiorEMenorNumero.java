package fase1.logica;

import java.util.Scanner;

public class Desafio24MaiorEMenorNumero {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int maior = 0;
            int menor = 0;

            System.out.println("Quantos Números você deseja informar? ");
            int num1 = sc.nextInt();

            for (int i = 1; i <= num1; i++) {
                System.out.println("Digite o " + i + "º número: ");
                int numAtual = sc.nextInt();
                if (numAtual < 0) {
                    System.out.println("Erro: O número não pode ser menor que zero.");
                    return;
                }
                else if (i == 1) {
                    maior = numAtual;
                    menor = numAtual;
                }
                if (numAtual > maior) {
                    maior = numAtual;
                }
                if (numAtual < menor) {
                    menor = numAtual;

                }
                System.out.println("Maior: " + maior);
                System.out.println("Menor: " + menor);

            }
        }

    }
}
