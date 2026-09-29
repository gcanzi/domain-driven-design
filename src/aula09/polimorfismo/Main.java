package aula09.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(3);
        Retangulo retangulo = new Retangulo(4,5);

        List<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(retangulo);

        for (Forma forma : formas) {
            System.out.printf("Area do %s: %.2f%n", forma.getClass().getSimpleName(), forma.calcularArea());
        }

        Pilha<String> string = new Pilha<>();
        string.empilhar("aaa");
        string.empilhar("bbb");
        string.empilhar("ccc");

        System.out.println("\nDesempilhando:");
        while (!string.estaVazia()) {
            System.out.println(string.desempilhar());
        }

        Pilha<Integer> integer = new Pilha<>();
        integer.empilhar(10);
        integer.empilhar(20);
        integer.empilhar(30);

        System.out.println("\nDesempilhando:");
        while (!integer.estaVazia()) {
            System.out.println(integer.desempilhar());
        }
    }
}