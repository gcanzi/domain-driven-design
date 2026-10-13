package aula11.model;

public class Carro {

    private String modelo;
    private double velocidade;

    public Carro(String modelo, double velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }
}
