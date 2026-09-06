package aula05.conteudo;

public class OperadorAritmetico {

    public static void main(String[] args){

        Calculos c = new Calculos();

        System.out.println("Soma: " + c.soma());
        System.out.println("Subtração: " + c.subtracao());
        System.out.println("Divisão: " + c.divisao());
        System.out.println("Multiplicacao: " + c.multiplicacao());
        System.out.println("Modulo: " + c.modulo());

    }
}
