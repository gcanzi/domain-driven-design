package aula07.exercicios;

public class Livro {

    private String titulo;
    private String autor;
    private double desconto;
    private double preco;

    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.desconto = 0.0;
        this.preco = 0.0;
    }

    public Livro(String titulo, String autor, double desconto, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.desconto = desconto;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double percentual) {
        return preco - (preco * percentual / 100);
    }

    public int aplicarDesconto(int valorFixo) {
        return (int) preco - valorFixo;
    }
}
