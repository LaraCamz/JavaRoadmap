package fase1.logica;
import java.util.Scanner;

public class Desafio13CalculadoraSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("Digite a operação (+, -, *, /):");
        String operacao = sc.next();
         
        double cont = 0;
        
        if(operacao.equals("+")){
        cont = num1 + num2;
        
        }else if(operacao.equals("-")){
        cont = num1 - num2;
        
        }else if(operacao.equals("*")){
        cont = num1 * num2;
        
        }else if(operacao.equals("/")){
        cont = num1 / num2;
        
        }else{
            System.out.println("Expressão Invalida!");
        }
        
        System.out.println(cont);
        sc.close();
        
    }
}
