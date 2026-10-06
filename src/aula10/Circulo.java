package aula10;

/**
 * Faz o calculo da area de um circulo
 *
 * @author Gustavo Canzi
 */
public class Circulo {

    // raio do circulo
    private double raio;

    /**
     * cria um circulo a partir do raio
     *
     * @param raio raio do circulo
     */
    public Circulo(double raio) {
        this.raio = raio;
    }

    /**
     * calcula a area do circulo
     *
     * @return area do circulo
     */
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

}