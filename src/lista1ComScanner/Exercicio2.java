package lista1ComScanner;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o código: ");
        int codigo = entrada.nextInt();

        System.out.print("Digite o preço: ");
        double preco = entrada.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = entrada.nextInt();

        System.out.println("\n--- PRODUTO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + quantidade);

        entrada.close();
    }
}