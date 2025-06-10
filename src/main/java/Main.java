import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu Nome: ");
        String nome = scanner.nextLine();
        scanner.close();
        System.out.println("Nome = "+nome);
    }
}
