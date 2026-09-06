package aula05.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = scanner.nextInt();

        int maior = a;
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }

        int menor = a;
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        scanner.close();
    }
}