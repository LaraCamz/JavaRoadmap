package fase1.logica;

import java.util.Scanner;

public class Desafio24_5AtualizacaoPassoAPasso {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int menor = 0;
            int maior = 0;

            

            for (int i = 1; i <= 5; i++) {
                System.out.println("Número " + i + ":");
                int numAtual = sc.nextInt();

                if (i == 1) {
                    maior = numAtual;
                    menor = numAtual;
                }

                if (numAtual <= menor) {
                    menor = numAtual;

                }
                if (numAtual >= maior) {
                    maior = numAtual;

                }

                System.out.println("Maior: " + maior);
                System.out.println("Menor: " + menor);

            }

        }
    }

}
