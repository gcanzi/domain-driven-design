package aula05.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String resultado;

        if(numero % 2 == 0) {
            resultado = "par";
        } else {
            resultado = "impar";
        }

        System.out.println("O número " + numero + " é " + resultado + ".");

        scanner.close();
    }
}