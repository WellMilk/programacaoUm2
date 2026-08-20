package lista2ComScanner;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Salário base: ");
        double salarioBase = entrada.nextDouble();

        System.out.print("Quantidade de horas extras: ");
        int horasExtras = entrada.nextInt();

        double valorHorasExtras = horasExtras * 35;
        double salarioFinal = salarioBase + valorHorasExtras;

        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + salarioBase);
        System.out.println("Valor das horas extras: R$ " + valorHorasExtras);
        System.out.println("Salário final: R$ " + salarioFinal);

        entrada.close();
    }
}