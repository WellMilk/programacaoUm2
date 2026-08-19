package lista1SemScanner;

public class Ex09 {

    public static void main(String[] args) {

        boolean ing = true;
        boolean doc = false;
        boolean acomp = true;

        boolean r1 = ing && doc;
        boolean r2 = ing || doc;
        boolean r3 = !doc;
        boolean r4 = ing && (doc || acomp);
        boolean r5 = !(ing && doc);

        System.out.println("Resultado 1: " + r1);

        System.out.println("Resultado 2: " + r2);

        System.out.println("Resultado 3: " + r3);

        System.out.println("Resultado 4: " + r4);

        System.out.println("Resultado 5: " + r5);
    }
}