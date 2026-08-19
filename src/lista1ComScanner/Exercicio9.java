package lista1ComScanner;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Possui ingresso? (true/false): ");
        boolean possuiIngresso = entrada.nextBoolean();

        System.out.print("Possui documento? (true/false): ");
        boolean possuiDocumento = entrada.nextBoolean();

        System.out.print("Acompanhante é maior de idade? (true/false): ");
        boolean acompanhanteMaiorIdade = entrada.nextBoolean();

        System.out.println(possuiIngresso && possuiDocumento);
        System.out.println(possuiIngresso || possuiDocumento);
        System.out.println(!possuiDocumento);
        System.out.println(
            possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade)
        );
        System.out.println(
            !(possuiIngresso && possuiDocumento)
        );

        entrada.close();
    }
}