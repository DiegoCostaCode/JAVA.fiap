import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("========Bem vindo ao sistema de cadastro de gatos lindos========");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro, digite o nome do Cachorro: ");
        var nome = scanner.nextLine();

        System.out.println("Agora, digite a raça do cachorro: ");
        var raca = scanner.nextLine();

        System.out.println("Cadastro Realizado: nome: " + nome + "raça: " +raca);
    }
    public static void CadastrarGatosLindos (Scanner scanner){

        System.out.println("Primeiro, digite o nome do Cachorro: ");
        var nome = scanner.nextLine ();

        System.out.println("Agora, digite a raça do cachorro: ");
        var raca = scanner.nextLine();
    }
}
