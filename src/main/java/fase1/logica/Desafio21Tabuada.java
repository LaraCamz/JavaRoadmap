package fase1.logica;

import java.util.Scanner;

public class Desafio21Tabuada {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Informe o número a ser multiplicado: ");
            int base = sc.nextInt();
            System.out.println("Informe o número inicio da Tabuada: ");
            int numInicio = sc.nextInt();
            System.out.println("Informe o número fim da Tabuada: ");
            int numFim = sc.nextInt();
            if (numInicio > numFim) {
                System.out.println("Erro: O inicio da tabuada deve ser menor que o número limite.");
                return;
            }

            System.out.println("===== TABUADA DO " + base + " =====");
            for (int i = numInicio; i <= numFim; i++) {
                int mult = base * i;
                System.out.println(base + " x " + i + " = " + mult);

            }

        }
    }

}
