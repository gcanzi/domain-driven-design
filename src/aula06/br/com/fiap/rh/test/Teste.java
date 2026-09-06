package aula06.br.com.fiap.rh.test;

import aula06.br.com.fiap.rh.model.Aluno;
import aula06.br.com.fiap.rh.model.Professor;

public class Teste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Gustavo");
        aluno.setNota(10);

        Professor professor = new Professor();
        professor.setNome("Canzi");
        professor.setDisciplina("Java");

        aluno.exibirDados();
        professor.exibirDados();
    }
}