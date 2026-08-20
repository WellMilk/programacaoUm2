package lista2SemScanner;

public class Ex08 {
    public static void main(String[] args) {
        double temperatura = 26.78;

        int temperaturaInteira = (int) temperatura;
        double temperaturaDouble = temperaturaInteira;

        System.out.println("Valor inicial: " + temperatura);
        System.out.println("Valor convertido para int: " + temperaturaInteira);
        System.out.println("Valor convertido novamente para double: " + temperaturaDouble);
    }
}