package lista2ComScanner;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade em estoque: ");
        int estoque = entrada.nextInt();

        String resultado = (estoque < 5) ? "Estoque baixo" : "Estoque suficiente";

        System.out.println(resultado);

        entrada.close();
    }
}