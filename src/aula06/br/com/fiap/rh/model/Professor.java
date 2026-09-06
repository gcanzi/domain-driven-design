package aula06.br.com.fiap.rh.model;

public class Professor {
    private String nome;
    private String disciplina;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void exibirDados() {
        System.out.println("Professor: " + nome);
        System.out.println("Disciplina: " + disciplina);
    }
}