package aula05.exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Valor inicial: " + x);

        x += 5;
        System.out.println("Após x += 5: " + x);

        x -= 3;
        System.out.println("Após x -= 3: " + x);

        x *= 2;
        System.out.println("Após x *= 2: " + x);

        x /= 4;
        System.out.println("Após x /= 4: " + x);

        x %= 3;
        System.out.println("Após x %= 3: " + x);
    }
}