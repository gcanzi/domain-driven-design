package aula11.exercicios.desafio;

import aula11.exercicios.desafio.model.Produto;

public class Exercicio03 {

    public static void main(String[] args){

        Produto[] vetor = {new Produto("Nome1", 10.0, 5),
                new Produto("Nome2", 20.0, 4),
                new Produto("Nome3", 30.0, 3),
                new Produto("Nome4", 40.0, 2),
                new Produto("Nome5", 50.0, 1),
        };

        double soma = 0;
        for (Produto produtos : vetor){
            soma += produtos.getPreco() * produtos.getQuantidade();
        }

        System.out.println("O valor total do estoque é " + soma);

    }
}
