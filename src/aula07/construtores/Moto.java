package aula07.construtores;

public class Moto {

    int ano;
    String marca;
    String modelo;

    public Moto() {

    }

    public Moto(int ano, String marca, String modelo) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Moto(int ano, String marca) {
        this.ano = ano;
        this.marca = marca;
    }

}
