package aula05.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A (true ou false): ");
        boolean A = scanner.nextBoolean();

        System.out.print("Digite o valor de B (true ou false): ");
        boolean B = scanner.nextBoolean();

        boolean and = A && B;
        boolean or = A || B;
        boolean notA = !A;
        boolean notB = !B;

        System.out.println("A && B = " + and);
        System.out.println("A || B = " + or);
        System.out.println("!A = " + notA);
        System.out.println("!B = " + notB);

        scanner.close();
    }
}