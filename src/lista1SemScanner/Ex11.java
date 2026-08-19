package lista1SemScanner;

public class Ex11 {

    public static void main(String[] args) {

        String nomeAluno = "Manuel Campos";
        int nota = 6;
        int frequencia = 75;

        String situacao = (nota >= 6 && frequencia >= 75)
                ? "Aprovado"
                : "Reprovado";

        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Situação: " + situacao);
    }
}