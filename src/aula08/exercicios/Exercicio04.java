package aula08.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero 0: ");
        int num = sc.nextInt();

        while (num != 0) {
            System.out.print("Numero invalido, digite 0:");
            num = sc.nextInt();
        }
    }
}
