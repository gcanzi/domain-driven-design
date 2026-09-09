package aula07.construtores;

public class Carro {

    int id;
    String marca;
    String modelo;

    public Carro() {
        id = 0;
        marca = "";
        modelo = "";
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void imprimir() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }

    public String retornarModelo() {
        return this.modelo;
    }
}
