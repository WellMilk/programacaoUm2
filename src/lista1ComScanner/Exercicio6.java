package lista1ComScanner;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor em dólares: ");
        double valorDolares = entrada.nextDouble();

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = entrada.nextDouble();

        double valorEmReais = valorDolares * cotacaoDolar;

        System.out.println("O monitor custa "
                + valorEmReais + " reais");

        entrada.close();
    }
}