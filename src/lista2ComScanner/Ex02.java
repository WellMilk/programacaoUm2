package lista2ComScanner;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Marca: ");
        String marca = entrada.nextLine();

        System.out.print("Modelo: ");
        String modelo = entrada.nextLine();

        System.out.print("Ano de fabricação: ");
        int ano = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Cor: ");
        String cor = entrada.nextLine();

        System.out.print("Valor: ");
        double valor = entrada.nextDouble();

        System.out.print("É automático? (true/false): ");
        boolean automatico = entrada.nextBoolean();

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$ " + valor);
        System.out.println("É automático: " + automatico);

        entrada.close();
    }
}