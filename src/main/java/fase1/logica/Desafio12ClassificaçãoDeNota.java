package fase1.logica;
import java.util.Scanner;

public class Desafio12ClassificaçãoDeNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a nota do aluno: ");
        double nota = sc.nextDouble();
        
        if(nota >= 7){
            System.out.printf("Nota: %.2f%n", nota);
            System.out.println("Aprovado");
        
        } else if(nota < 5 ){
            System.out.printf("Nota: %.2f%n", nota);
            System.out.println("Reprovado");
        
        }else{
            System.out.printf("Nota: %.2f%n", nota);
            System.out.println("Recuperação");
        
        }
        sc.close();
    }
}
