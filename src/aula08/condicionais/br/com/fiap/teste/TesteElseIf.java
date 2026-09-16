package aula08.condicionais.br.com.fiap.teste;

public class TesteElseIf {

    public static void main(String args[]) {

        int idade = 16;

        if(idade >= 65) {
            System.out.println("Aposentado!");
        } else if(idade >= 18) {
            System.out.println("Idade maior de 18!");
        } else {
            System.out.println("Idade menor de 18!");
        }

    }
}