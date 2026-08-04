package fase1.logica;
import java.util.Scanner;

public class Desafio10ParOuimpar {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Informe um número inteiro: ");
        int num1 = sc.nextInt();
        
        if(num1%2 == 0){
            System.out.println("O número é par.");
        }else{
            System.out.println("O número é ímpar.");
        }
      sc.close();
    }
    
}
