package lista1ComScanner;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do arroz: ");
        double arroz = entrada.nextDouble();

        System.out.print("Digite o valor do feijão: ");
        double feijao = entrada.nextDouble();

        System.out.print("Digite o valor do óleo: ");
        double oleo = entrada.nextDouble();

        double total = arroz + feijao + oleo;
        double media = total / 3;

        System.out.println("Valor total: R$ " + total);
        System.out.println("Valor médio: R$ " + media);

        entrada.close();
    }
}