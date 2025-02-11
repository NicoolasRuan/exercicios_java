import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.text.spi.NumberFormatProvider;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        /*
            5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos
             salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        NumberFormat formatoMoedaBrasil = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        double salarioMinimo, salarioUsuario, quantidadeSalarioMinimo;

        System.out.print("Digite o salario minimo atual: R$");
        salarioMinimo = sc.nextDouble();

        System.out.print("Digite o salario do usuario: R$");
        salarioUsuario = sc.nextDouble();

        quantidadeSalarioMinimo = salarioUsuario / salarioMinimo;

        System.out.printf("De acordo com o salario minimo digitado (%s) o usuario recebe %.2f salarios minimos", formatoMoedaBrasil.format(salarioMinimo), quantidadeSalarioMinimo);


    }
}
