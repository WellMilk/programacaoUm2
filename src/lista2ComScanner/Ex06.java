package lista2ComScanner;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de quilômetros: ");
        double quilometros = entrada.nextDouble();

        double metros = quilometros * 1000;

        System.out.println("Distância em metros: " + metros);

        entrada.close();
    }
}