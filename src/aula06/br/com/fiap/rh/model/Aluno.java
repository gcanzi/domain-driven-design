package aula06.br.com.fiap.rh.model;

public class Aluno {
    private String nome;
    private double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void exibirDados() {
        System.out.println("Aluno: " + nome);
        System.out.println("Nota: " + nota);
    }
}