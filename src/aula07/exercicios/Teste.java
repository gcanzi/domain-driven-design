package aula07.exercicios;

public class Teste {

    public static void main(String[] args) {

        Livro livro1 = new Livro("livro1", "nome1", 10, 50.00);
        Livro livro2 = new Livro("livro2", "nome2", 20, 100.00);
        Livro livro3 = new Livro("livro3", "nome3", 30, 150.00);

        System.out.println("O livro: " + livro1.getTitulo() + " custa " + livro1.getPreco());
        System.out.println("Com desconto percentual fica R$ " + livro1.desconto(10.0));
        System.out.println("Com desconto fixo fica R$ " + livro1.desconto(10));

        System.out.println("\nO livro: " + livro2.getTitulo() + " custa " + livro2.getPreco());
        System.out.println("Com desconto percentual fica R$ " + livro2.desconto(20.0));
        System.out.println("Com desconto fixo fica R$ " + livro2.desconto(20));

        System.out.println("\nO livro: " + livro3.getTitulo() + " custa " + livro3.getPreco());
        System.out.println("Com desconto percentual fica R$ " + livro3.desconto(30.0));
        System.out.println("Com desconto fixo fica R$ " + livro3.desconto(30) );

    }
}
