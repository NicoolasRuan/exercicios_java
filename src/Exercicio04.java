import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        /*
            4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
         */

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        System.out.println("Antecessor: " + (n-1));
        System.out.println("Sucessor: " + (n+1));
    }
}
