package fase1.logica;

import java.util.Scanner;

public class Desafio19LoginDoBancoAutenticacao {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String usuarioCorreto = "admin";
            String senhaCorreta = "1234";
            int tentativas = 3;
            int aux = 3;

            while (tentativas != 0 || aux != 0) {
                
            System.out.printf("Tentativas restantes: %d %n", tentativas);    
            System.out.println("Digite o usuario: ");
            String usuario = sc.next();
            System.out.println("Digite a senha: ");
            String senha = sc.next();
            

                if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                    System.out.println("Bem-vindo ao sistema!");
                    aux = 0;
                } else if (usuario.equals(usuarioCorreto) && !senha.equals(senhaCorreta)) {
                    System.out.println("Senha incorreta.");
                    tentativas -= 1;
                } else if (!usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                    System.out.println("Usuário não encontrado.");
                    tentativas -= 1;
                } else if (!usuario.equals(usuarioCorreto) && !senha.equals(senhaCorreta)) {
                    System.out.println("Usuário e senha incorretos.");
                    tentativas -= 1;
                } if (tentativas == 0) {
                    System.out.println("Conta bloqueada.\n"
                            + "\n"
                            + "Encerrando sistema...");

                }
            }

        }
    }
}
