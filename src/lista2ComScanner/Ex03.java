package lista2ComScanner;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Distância percorrida em km: ");
        double distancia = entrada.nextDouble();

        System.out.print("Quantidade de litros consumidos: ");
        double litros = entrada.nextDouble();

        double consumoMedio = distancia / litros;
        double litrosPara100Km = 100 / consumoMedio;

        System.out.println("Consumo médio: " + consumoMedio + " km/l");
        System.out.println("Litros necessários para 100 km: " + litrosPara100Km);

        entrada.close();
    }
}