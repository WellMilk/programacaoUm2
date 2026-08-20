package lista2ComScanner;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = entrada.nextDouble();

        int temperaturaInteira = (int) temperatura;
        double temperaturaDouble = temperaturaInteira;

        System.out.println("Valor inicial: " + temperatura);
        System.out.println("Valor convertido para int: " + temperaturaInteira);
        System.out.println("Valor convertido novamente para double: " + temperaturaDouble);

        entrada.close();
    }
}