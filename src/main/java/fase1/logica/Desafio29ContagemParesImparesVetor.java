package fase1.logica;

import java.util.Scanner;

public class Desafio29ContagemParesImparesVetor {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("===== NÚMEROS =====");
            System.out.println("Quantidade: ");
            int num1 = sc.nextInt();
            if (num1 <= 0) {
                System.out.println("Erro: O número deve ser maior que 0.");
                return;
            }

            int[] vetor = new int[num1];
            int cont = 1;
            int quantPar = 0;
            int quantImp = 0;

            for (int i = 0; i < num1; i++) {
                System.out.println("Número " + cont + ": ");
                int num2 = sc.nextInt();
                vetor[i] = num2;
                cont++;
            }

            for (int a = 0; a < num1; a++) {
                if (vetor[a] % 2 == 0) {
                    quantPar++;
                } else {
                    quantImp++;
                }  
            }
            System.out.println("===== RESULTADO =====");
            System.out.println("Quantidade de pares: " + quantPar);
            System.out.println("Quandidade de impar: " + quantImp);

        }
    }

}
