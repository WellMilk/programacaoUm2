package lista1SemScanner;


public class Ex05 {

    public static void main(String[] args) {

        double arroz = 27.90;
        double feijao = 9.80;
        double oleo = 8.50;

        double valorTotal = arroz + feijao + oleo;
        double valorMedio = valorTotal / 3;

        System.out.println("Valor total da compra: R$ " + valorTotal);
        System.out.println("Valor médio dos produtos: R$ " + valorMedio);
    }
}