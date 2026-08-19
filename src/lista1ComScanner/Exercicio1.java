package lista1ComScanner;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite a altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite o peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = entrada.next().charAt(0);

        System.out.print("A matrícula está ativa? (true/false): ");
        boolean matricula = entrada.nextBoolean();

        System.out.println("\n--- DADOS DA PESSOA ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        System.out.println("Matrícula ativa: " + matricula);

        entrada.close();
    }
}