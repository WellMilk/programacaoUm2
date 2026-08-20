package lista2SemScanner;

public class Ex07 {
    public static void main(String[] args) {
        double nota = 8.95;

        int notaInteira = (int) nota;
        double notaDouble = notaInteira;

        System.out.println("Valor inicial: " + nota);
        System.out.println("Valor convertido para int: " + notaInteira);
        System.out.println("Valor convertido novamente para double: " + notaDouble);
    }
}