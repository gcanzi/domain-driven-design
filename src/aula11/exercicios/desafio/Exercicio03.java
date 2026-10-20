package aula11.exercicios.desafio;

import aula11.exercicios.desafio.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {

    public static void main(String[] args){

        Produto[] vetor = {new Produto("Nome1", 10.0, 5),
                new Produto("Nome2", 20.0, 4),
                new Produto("Nome3", 30.0, 3),
                new Produto("Nome4", 40.0, 2),
                new Produto("Nome5", 50.0, 1)
        };

        double soma = 0;
        for (Produto produtos : vetor){
            soma += produtos.getPreco() * produtos.getQuantidade();
        }

        System.out.println("O valor total do estoque é " + soma);

        Produto maisCaro = vetor[0];
        for (Produto produto : vetor) {
            if (produto.getPreco() > maisCaro.getPreco()) {
                maisCaro = produto;
            }
        }

        System.out.println("O " + maisCaro.getNome() + " é o produto mais caro");

        List<String> listaReposicao = new ArrayList<>();
        for (Produto produto : vetor) {
            if (produto.getQuantidade() < 5) {
                listaReposicao.add(produto.getNome());
            }
        }

        if (!listaReposicao.isEmpty()) {
            String reposicao = String.join(", ", listaReposicao);
            System.out.println("Os produtos: " + reposicao + " precisam de reposição");
        }
    }
}
