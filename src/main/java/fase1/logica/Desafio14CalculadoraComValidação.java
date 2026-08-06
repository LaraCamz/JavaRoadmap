package fase1.logica;
import java.util.Scanner;

public class Desafio14CalculadoraComValidação {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("Digite a operação: ");
        String operacao = sc.next();
        
        double calculo = 0;
        
        if(operacao.equals("+")){
            calculo = num1 + num2; 

        }else if(operacao.equals("-")){
            calculo = num1 - num2;
      
        }else if(operacao.equals("*")){
            calculo = num1 * num2;
        
        }else if(operacao.equals("/")){
            if(num2 == 0){
                System.out.println("Erro: não é possível dividir por zero.");
                return;
            }else{
                calculo = num1 / num2;
            }
    }else{
            System.out.println("Expressão Inválida.");
        return;
   
        }
        System.out.printf("Resultado: %.2f" ,calculo);
        sc.close();
  }   
}
