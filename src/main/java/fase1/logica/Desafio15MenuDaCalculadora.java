package fase1.logica;
import java.util.Scanner;

public class Desafio15MenuDaCalculadora {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
       
        System.out.println("Informe o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("Digite a operação: ");
        String operacao = sc.next();

        double calculo = 0;
        
        switch (operacao) {
            case "+" :
                calculo = num1 + num2;
                break;
            
            case "-" :
                calculo = num1 - num2;
                break;
        
            case "*" :
                calculo = num1 * num2;
                break;
                
            case "/" :
                if(num2 == 0){
                    System.out.println("Erro: não é possível dividir por zero.");
                    return;
                }
                calculo = num1 / num2;
                break;  
                
            default : 
                System.out.println("Expressão Inválida.");
                return;
    }
        System.out.printf("Resultado: %.2f", calculo);
    }
  }
}
