package aula08.exercicios;

import java.util.Scanner;

/**
 * Gustavo Moretim Canzi
 * RM 567683
 *
 * @author gcanzi
 */
public class BoletimTurma {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int aprovado = 0;
        int recuperacao = 0;
        int reprovado = 0;

        for(int i=1; i<=5; i++){
            System.out.print("Digite a nota do " + i + "° aluno: ");
            int nota = sc.nextInt();

            while (nota < 0 || nota > 10) {
                System.out.print("Nota invalida, digite novamente: ");
                nota = sc.nextInt();
            }

            if(nota >= 7){
                aprovado++;
            } else if (nota >= 5) {
                recuperacao++;
            } else {
                reprovado++;
            }
        }

        System.out.println("\nResultado da turma:");
        System.out.println("Alunos aprovados: " + aprovado);
        System.out.println("Alunos de recuperação: " + recuperacao);
        System.out.println("Alunos reprovados: " + reprovado);

    }
}
