package fase1.logica;

import java.util.Scanner;

public class Desafio24_4MaiorMenorSequenciaFixa {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int menor = 0;
            int maior = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.println("Digite 5 números: ");
                int numAtual = sc.nextInt();

                if (i == 1) {
                    menor = numAtual;
                    maior = numAtual;
                }

                if (numAtual <= menor) {
                    menor = numAtual;
                }
                if (numAtual >= maior) {
                    maior = numAtual;

                }

            }
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);

        }
    }

}
