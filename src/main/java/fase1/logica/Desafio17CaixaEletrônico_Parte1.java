package fase1.logica;
import java.util.Scanner;

public class Desafio17CaixaEletrônico_Parte1 {


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        
            double saldo = 1000;
            String opcao = "";
            
            while(!"4".equals(opcao)){
            System.out.printf("===== BANCO ===== %n"
                    + "1 - Consultar saldo%n"
                    + "2 - Depositar%n"
                    + "3 - Sacar%n"
                    + "4 - Sair%n");
            System.out.printf("Selecione uma opção: %n");
            opcao = sc.next();

            switch (opcao){
                case "1":
                    System.out.printf("Saldo atual: %.2f"
                            + "%n", saldo);
                    break;
                    
                case "2":
                    System.out.printf("Quanto deseja depositar?%n");
                    double deposito = sc.nextDouble();
                    if(deposito <= 0){
                        System.out.println("Operação não realizada. O valor do depósito deve ser maior que R$ 0,00.");
                    }
                    System.out.printf("+%.2f%n", deposito);
                    saldo = saldo + deposito;
                     System.out.printf("Saldo atual: %.2f"
                            + "%n", saldo);
                    break;
                    
                case "3":
                    System.out.println("Quanto deseja sacar? ");
                    double saque = sc.nextDouble();
                    if(saldo >= saque){
                        System.out.printf("-%.2f%n", saque);
                        saldo = saldo - saque;    
                         System.out.printf("Saldo atual: %.2f"
                            + "%n", saldo);
                    }else if(saldo < saque){
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                    
                case "4":
                    System.out.println("Volte sempre!");
                    break;
                    
                default:
                    System.out.println("Expressão inválida.");
    
            }

        }
    }
    
    }
}
