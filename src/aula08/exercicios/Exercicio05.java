package aula08.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = sc.nextLine();

        String login;
        do {
            System.out.print("Faça login com a senha: ");
            login = sc.nextLine();
        } while (!login.equals(senha));

        System.out.println("Login realizado!");

    }
}