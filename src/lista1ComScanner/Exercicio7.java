package lista1ComScanner;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = entrada.nextDouble();

        int salarioInteiro = (int) salario;

        double salarioDouble = (double) salarioInteiro;

        System.out.println("Salário inicial: " + salario);
        System.out.println("Salário convertido para int: " + salarioInteiro);
        System.out.println("Salário convertido para double: " + salarioDouble);

        entrada.close();
    }
}