package aula09.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {
    private List<T> elementos = new ArrayList<>();

    public void empilhar(T item) {
        elementos.add(item);
    }

    public T desempilhar() {
        return elementos.remove(elementos.size() - 1);
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }
}