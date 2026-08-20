package lista2ComScanner;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nomeProduto = entrada.nextLine();

        System.out.print("Valor unitário: ");
        double valorUnitario = entrada.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = entrada.nextInt();

        System.out.print("Quantidade de parcelas: ");
        int parcelas = entrada.nextInt();

        double valorTotal = valorUnitario * quantidade;
        double valorParcela = valorTotal / parcelas;

        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Valor unitário: R$ " + valorUnitario);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$ " + valorTotal);
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.println("Valor de cada parcela: R$ " + valorParcela);

        entrada.close();
    }
}