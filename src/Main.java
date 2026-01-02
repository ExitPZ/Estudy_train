import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        int opcao;
        boolean logado = false;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Fazer login");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Usuário: ");
                    String usuario = sc.nextLine();

                    System.out.print("Senha: ");
                    String senha = sc.nextLine();

                    if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                        System.out.println("✅ Login realizado com sucesso!");
                        logado = true;
                    } else {
                        System.out.println("❌ Usuário ou senha incorretos.");
                    }
                    break;

                case 2:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 2 && !logado);

        sc.close();
    }
}
