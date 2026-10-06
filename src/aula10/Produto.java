package aula10;

/**
 * Produto com nome e preço
 *
 * @author Gustavo Canzi
 */
public class Produto {

    private String nome;
    private double preco;

    /**
     * Construtor do produto com nome e preço
     *
     * @param nome  nome do produto
     * @param preco preço do produto
     */
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * Retorna o nome do produto
     *
     * @return nome do produto
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto
     *
     * @param nome novo nome do produto
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o preço do produto
     *
     * @return preço do produto
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do produto
     *
     * @param preco novo preço do produto
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
}