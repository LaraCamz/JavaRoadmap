package fase1.logica;

import java.util.Scanner;

public class Desafio19LoginDoBancoAutenticacao {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String usuarioCorreto = "admin";
            String senhaCorreta = "1234";
            int tentativas = 0;

            System.out.println("Digite o usuario: ");
            String usuario = sc.next();
            System.out.println("Digite a senha: ");
            String senha = sc.next();

            while (tentativas != 3) {

                if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                    System.out.println("Bem-vindo ao sistema!");
                } if (usuario.equals(usuarioCorreto) && !senha.equals(senhaCorreta)) {
                    System.out.println("Senha incorreta.");
                    tentativas += 1;
                } if (!usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                    System.out.println("Usuário não encontrado.");
                    tentativas += 1;
                } if (!usuario.equals(usuarioCorreto) && !senha.equals(senhaCorreta)) {
                    System.out.println("Usuário e senha incorretos.");
                    tentativas += 1;
                } if (tentativas == 3) {
                    System.out.println("Conta bloqueada.\n"
                            + "\n"
                            + "Encerrando sistema...");

                }
            }

        }
    }
}
