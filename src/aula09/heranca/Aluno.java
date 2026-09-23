package aula09.heranca;

public class Aluno extends Pessoa {

    private String sala;

    public Aluno(String nome, int idade, String documento, String sala) {
        super(nome, idade, documento);
        this.sala = sala;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void estudar() {
        System.out.println("Aluno estudando!");
    }
}
