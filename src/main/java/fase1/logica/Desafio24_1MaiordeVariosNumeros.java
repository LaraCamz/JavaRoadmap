package fase1.logica;

import java.util.Scanner;

public class Desafio24_1MaiordeVariosNumeros {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int maior = 0;

            System.out.println("Quantidade: ");
            int num1 = sc.nextInt();
            if (num1 <= 0) {
                System.out.println("Erro: O número deve ser maior que 0.");
                return;
            }

            for (int i = 1; i <= num1; i++) {
                System.out.println("Número " + i + ": ");
                int numAtual  = sc.nextInt();

                if (i == 1) {
                    maior = numAtual ;
                }

                if (numAtual  > maior) {
                    maior = numAtual ;
                }
            }
            System.out.println("Maior Número: " + maior);
        }
    }

}
