package fase1.logica;
import java.util.Scanner;

public class Desafio09Maioridade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();
        
        if(idade >= 18){
            System.out.println("Você é maior de idade.");
        }else{
            System.out.println("Você é menor de idade.");
        }
        
    }
    
}
