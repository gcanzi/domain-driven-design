package aula11.exercicios.desafio;

import aula11.exercicios.desafio.model.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto[] produtos = {
                new Produto("Nome6", 60.0, 6),
                new Produto("Nome1", 10.0, 5),
                new Produto("Nome2", 20.0, 4),
                new Produto("Nome3", 30.0, 3),
                new Produto("Nome4", 40.0, 2),
                new Produto("Nome5", 50.0, 1)
        };

        // O List aceita mais comandos para pegar um valor
        List<Produto> listaProdutos = new ArrayList<>();
        for (Produto produto : produtos) {
            listaProdutos.add(produto);
        }

        System.out.print("Digite um valor: ");
        double valor = sc.nextDouble();

        List<Produto> filtrados = new ArrayList<>();
        for (Produto produto : listaProdutos) {
            if (produto.getPreco() > valor) {
                filtrados.add(produto);
            }
        }

        filtrados.sort(Comparator.comparingDouble(Produto::getPreco));

        System.out.println("Produtos acima de " + valor + ":");
        for (Produto produto : filtrados) {
            System.out.println(produto.getNome());
        }

        sc.close();
    }
}