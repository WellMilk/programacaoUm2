package lista2ComScanner;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = entrada.nextDouble();

        int notaInteira = (int) nota;
        double notaDouble = notaInteira;

        System.out.println("Valor inicial: " + nota);
        System.out.println("Valor convertido para int: " + notaInteira);
        System.out.println("Valor convertido novamente para double: " + notaDouble);

        entrada.close();
    }
}