package fase1.logica;

import java.util.Scanner;

public class Desafio18CadastroUsuarioDeBanco {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String aux = "";
            double saldo = 1000;

            System.out.println("===== BANCO CADASTRO =====");
            System.out.println("Informe seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Informe sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.println();

            while (!"5".equals(aux)) {
                System.out.println();
                System.out.printf("===== BANCO =====%n "
                        + "1 - Ver dados da conta%n "
                        + "2 - Alterar nome%n "
                        + "3 - Depositar%n "
                        + "4 - Sacar%n "
                        + "5 - Sair%n ");
                System.out.println("Selecione uma opção: ");
                aux = sc.next();
                sc.nextLine();
                System.out.println();

                switch (aux) {
                    case "1":
                        System.out.printf(
                                "===== Informaçoes ===== %n"
                                + "Nome:  %s%n"
                                + "Idade: %d%n"
                                + "Saldo: %.2f%n",
                                nome,
                                idade,
                                saldo
                        );
                        break;

                    case "2":
                        System.out.println("Informe o novo nome: ");
                        nome = sc.nextLine();
                        System.out.println("Nome atualizado! Verifique a alteração apertando (1).");
                        break;

                    case "3":
                        System.out.println("Informe o valor do deposito: ");
                        double deposito = sc.nextDouble();
                        sc.nextLine();

                        if (deposito <= 0) {
                            System.out.printf("Operação não realizada. O valor do deposito deve ser maior que R$ 0,00.");
                            break;

                        } else {
                            saldo += deposito;
                            System.out.println();
                            System.out.printf("+%.2f%n", deposito);
                            System.out.printf("Saldo Atual: %.2f", saldo);
                        }
                        break;

                    case "4":
                        System.out.println("Informe o valor do saque: ");
                        double saque = sc.nextDouble();
                        sc.nextLine();
                        System.out.println();
                        if (saque <= 0) {
                            System.out.println("Operação não realizada. O valor do saque deve ser maior que R$ 0,00.");
                            break;
                        } else if (saldo < saque) {
                            System.out.println("Saldo Insuficiente.");
                            break;
                        } else {
                            saldo -= saque;
                            System.out.printf("-%.2f%n", saque);
                            System.out.printf("Saldo Atual: %.2f", saldo);

                        }
                        break;

                    case "5":
                        System.out.println("Volte sempre!");
                        break;

                    default:
                        System.out.println("Expressão Inválida.");
                        break;

                }
            }

        }

    }
}
