package fase1.logica;
import java.util.Scanner;

public class Desafio20ContagemProgressiva {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            
            System.out.println("Digite um número: ");
            int num1 = sc.nextInt();
            
            
            System.out.println("===== PROGRESSIVA =====");
            for (int i = 1; i <= num1; i++){
                System.out.println(i); 
                
            }
            
            System.out.println("===== REGRESSIVA =====");  
            for (int a = num1; a > 0 ; a--){
                System.out.println(a);

        }
        
        
    }
    
}
}