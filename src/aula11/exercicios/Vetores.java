package aula11.exercicios;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        double[] vetor = new double[5];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<vetor.length; i++){
            System.out.print("Digite a nota do " + (i+1) + "° aluno: ");
            vetor[i] = sc.nextInt();
        }

        double soma = 0;
        for(double vet : vetor){
            soma += vet;
        }

        double media = soma / vetor.length;
        System.out.println("A media dos vetores é: " + media);

        for(double vet : vetor){
            if(vet < 0) {
                System.out.println("O numero " + vet + " é negativo");
            } else {
                System.out.println("O numero " + vet + " é positivo");
            }

        }
    }
}
