package lista2ComScanner;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = entrada.nextDouble();

        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        System.out.println("Soma das notas: " + soma);
        System.out.println("Média final: " + media);

        entrada.close();
    }
}