
package aula11.exercicios.desafio;

import aula11.exercicios.desafio.model.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio04 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;
        List<Aluno> listaAlunos = new ArrayList<>();

        while (opcao != 4) {
            exibirMenu();
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> adicionarAluno(listaAlunos);
                case 2 -> removerAluno(listaAlunos);
                case 3 -> listarAlunos(listaAlunos);
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida! Digite novamente.");
            }

            System.out.println();
        }

        sc.close();
    }

    private static void exibirMenu() {
        System.out.println("====== MENU ======");
        System.out.println("1 - Adicionar aluno");
        System.out.println("2 - Remover aluno");
        System.out.println("3 - Listar alunos e estatisticas");
        System.out.println("4 - Sair");
    }

    private static void adicionarAluno(List<Aluno> lista) {
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();
        sc.nextLine();

        lista.add(new Aluno(nome, nota));

        System.out.println("Aluno adicionado!");
    }

    private static void removerAluno(List<Aluno> lista) {
        if (lista.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado");
            return;
        }

        System.out.print("Digite o nome do aluno que deseja remover: ");
        String nome = sc.nextLine();

        boolean removido = false;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equals(nome)) {
                lista.remove(i);
                removido = true;
                i--;
            }
        }

        if (removido) {
            System.out.println("Aluno removido!");
        } else {
            System.out.println("Aluno não encontrado");
        }
    }

    private static void listarAlunos(List<Aluno> lista) {
        if (lista.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado");
            return;
        }

        System.out.println("\nLista de Alunos:");

        double soma = 0;

        for (Aluno aluno : lista) {
            System.out.println(aluno.getNome());

            soma += aluno.getNota();
        }

        double media = soma / lista.size();

        System.out.println("\nEstatisticas dos Alunos:");
        System.out.println("Quantidade de alunos: " + lista.size());
        System.out.printf("Media da turma: %.2f%n", media);

        System.out.println("\nAlunos acima da media: ");

        List<String> acimaDaMedia = new ArrayList<>();

        for (Aluno aluno : lista) {
            if (aluno.getNota() > media) {
                acimaDaMedia.add(aluno.getNome());
            }
        }

        if (!acimaDaMedia.isEmpty()) {
            String alunos = String.join(", ", acimaDaMedia);
            System.out.println("Os alunos " + alunos + " estão acima da media");
        } else {
            System.out.println("Nenhum aluno esta acima da media");
        }
    }
}