package lista2ComScanner;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Curso: ");
        String curso = entrada.nextLine();

        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Média final: ");
        double mediaFinal = entrada.nextDouble();

        System.out.print("Está matriculado? (true/false): ");
        boolean matriculado = entrada.nextBoolean();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Altura: " + altura);
        System.out.println("Média final: " + mediaFinal);
        System.out.println("Está matriculado: " + matriculado);

        entrada.close();
    }
}