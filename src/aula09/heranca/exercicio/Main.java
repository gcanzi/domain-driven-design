package aula09.heranca.exercicio;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("thor", 5);
        Gato gato = new Gato("maya", 3);

        cachorro.comer();
        cachorro.dormir();

        gato.comer();
        gato.dormir();

        cachorro.latir();
        gato.miar();

        System.out.println(cachorro.getNome() + " tem " + cachorro.getIdade() + " anos");
        System.out.println(gato.getNome() + " tem " + gato.getIdade() + " anos");
    }
}