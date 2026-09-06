package aula05.conteudo;

public class OperadorCombinado {

    public static void main(String[] args) {

        int numero = 10;
        numero += 20;
        System.out.println("Operador += :" + numero);

        numero -= 5;
        System.out.println("Operador -= :" + numero);

        numero /= 5;
        System.out.println("Operador /= :" + numero);

        numero *= 5;
        System.out.println("Operador *= :" + numero);

        numero %= 2;
        System.out.println("Operador %= :" + numero);

    }
}
