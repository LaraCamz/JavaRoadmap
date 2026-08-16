package fase1.logica;

import java.util.Scanner;

public class Desafio24_5AtualizacaoPassoAPasso {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int maior;
            int menor;

            System.out.println("Digite 5 números: ");

            System.out.println("Número 1:");
            int numAtual = sc.nextInt();

            maior = numAtual;
            menor = numAtual;

            for (int i = 2; i <= 5; i++) {

                System.out.println("Número " + i + ":");
                numAtual = sc.nextInt();

                if (numAtual < menor) {
                    menor = numAtual;
                }

                if (numAtual > maior) {
                    maior = numAtual;
                }

                System.out.println("Maior: " + maior);
                System.out.println("Menor: " + menor);
            }

        }
    }

}
