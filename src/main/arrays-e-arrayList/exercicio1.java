
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
//        Crie um programa que:
//        Declare um array de 5 números inteiros
//        Preencha com valores digitados pelo usuário
//        Exiba todos os valores e a soma total
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("===LISTA DE 5 NÚMEROS INTEIROS===");

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            numeros[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("===EXIBIÇÃO DOS "+ numeros.length+" NÚMEROS===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("O "+(i + 1) + "° número é: " + numeros[i]);
        }
        System.out.println("===SOMA DOS "+ numeros.length+" NÚMEROS DIGITADOS===");
        System.out.println("Soma: " + soma);

    }
}
