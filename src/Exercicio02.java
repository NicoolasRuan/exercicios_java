import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        // 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela sre o número é par ou ímpa, positivo ou negativo.

        Scanner sc = new Scanner(System.in);
        String string;
        int n;

        System.out.print("Digite um numero: ");
        n = sc.nextInt();

        string = n % 2 == 0 ? "Número Par" : "Número Impar";
        System.out.println(string);
        string = n >= 0 ? "Número Positivo" : "Número Negativo";
        System.out.println(string);


    }

}
