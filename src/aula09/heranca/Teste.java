package aula09.heranca;

public class Teste {

    public static void main(String[] args){

        Aluno aluno = new Aluno("Joao", 19, "123456", "10");
        aluno.estudar();
        aluno.comer();

        Professor professor = new Professor("Maria", 20, "654321", "20");
        professor.comer();
        professor.ensinar();
        professor.receber();

    }
}
