import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B e mostre se a soma é menor que C

        Scanner sc = new Scanner(System.in);
        int A, B, C, soma;

        System.out.print("valor A: ");
        A = sc.nextInt();

        System.out.print("valor B: ");
        B = sc.nextInt();

        System.out.print("valor C: ");
        C = sc.nextInt();
        soma = A + B;

        System.out.println("soma A e B = " + soma);
        System.out.println("soma menor que C? = " + (soma < C ? "SIM" : "NÃO"));

        sc.close();

    }

}
