package aula05.conteudo;

public class OperadorComparacao {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        boolean igual = (a == b);
        System.out.println("Comparando utilizando o operador == " + a + " com " + b + " o resultado é " + igual);

        boolean diferente = (a != b);
        System.out.println("Comparando utilizando o != " + a + " com " + b + " o resultado é " + diferente);

        boolean maior = (a > b);
        System.out.println("Comparando utilizando o > " + a + " com " + b + " o resultado é " + maior);

        boolean menor = (a < b);
        System.out.println("Comparando utilizando o < " + a + " com " + b + " o resultado é " + menor);

        boolean maiorIgual = (a >= b);
        System.out.println("Comparando utilizando o >= " + a + " com " + b + " o resultado é " + maiorIgual);

        boolean menorIgual = (a <= b);
        System.out.println("Comparando utilizando o < " + a + " com " + b + " o resultado é " + menorIgual);

    }
}
