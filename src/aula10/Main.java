package aula10;

/**
 * Classe principal para demonstrar o funcionamento
 * das classes {@link Circulo} e {@link Produto}
 * <p>
 * Calcula o raio de um circulo e exibe o produto com seu preço
 *
 * @author Gustavo Canzi
 */
public class Main {
    public static void main(String[] args) {

        // define o raio do circulo pela instancia
        Circulo circulo = new Circulo(5);

        System.out.println("Area do circulo: " + circulo.calcularArea());

        // define o produto e o preço pela instancia
        Produto produto = new Produto("celular", 1000.0);

        System.out.println("O " + produto.getNome() + " custa R$" + produto.getPreco());
    }
}
