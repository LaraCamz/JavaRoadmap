package fase1.logica;

import java.util.Scanner;

public class Desafio25MaiorNumeroEPosicao {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int maior = 0;
            int posicao = 0;

            System.out.println("Quantidade: ");
            int num1 = sc.nextInt();

            for (int i = 1; i <= num1; i++) {
                System.out.println("Número " + i + ":");
                int numAtual = sc.nextInt();

                if (i == 1) {
                    maior = numAtual;
                    posicao = i;

                }

                if (numAtual > maior) {
                    maior = numAtual;
                    posicao = i;
                }

            }
            System.out.println("Maior número: " + maior);
            System.out.println("Primeira posição: " + posicao);

        }
    }

}
