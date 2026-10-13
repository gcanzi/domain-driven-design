package aula11.vetores;

import aula11.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAlunos {

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Nome1", 9.0));
        alunos.add(new Aluno("Nome2", 9.5));
        alunos.add(new Aluno("Nome3", 7.0));
        alunos.add(new Aluno("Nome4", 8.0));

        Aluno melhorAluno = alunos.getFirst();

        for (Aluno aluno : alunos) {
            if (aluno.getNota() > melhorAluno.getNota()) {
                melhorAluno = aluno;
            }
        }

        System.out.println("O aluno com a maior nota é o " + melhorAluno.getNome());
    }
}
