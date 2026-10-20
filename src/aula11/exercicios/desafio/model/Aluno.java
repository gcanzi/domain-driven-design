package aula11.exercicios.desafio.model;

public class Aluno {

    String nome;
    Double nota;

    public Aluno(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public Double getNota() {
        return nota;
    }
}
