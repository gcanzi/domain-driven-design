package aula09.heranca;

public class Professor extends Pessoa{

    private String materia;

    public Professor(String nome, int idade, String documento, String materia) {
        super(nome, idade, documento);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void ensinar() {
        System.out.println("Professor ensinando!");
    }

    public void receber() {
        System.out.println("Professor recebendo!");
    }
}
