import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
        caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
        imprimir seu valor na tela.
        */
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println(c);




    }
}
