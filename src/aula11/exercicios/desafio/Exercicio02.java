package aula11.exercicios.desafio;

import java.util.Arrays;

public class Exercicio02 {

    public static void main(String[] args) {

        String[] nomes = {"Nome1", "Nome2", "Nome3", "Nome4", "Nome1", "Nome2"};

        System.out.println("Nomes repetidos:");

        for (int i=0; i<nomes.length; i++) {

            int quantidade = 1;

            for (int j=i+1; j<nomes.length; j++) {

                if (nomes[i].equals(nomes[j])) {
                    quantidade++;
                }
            }

            if (quantidade > 1) {
                System.out.println(nomes[i] + " aparece " + quantidade + " vezes");
            }
        }

        System.out.println("\nVetor na ordem inversa:");

        for (int i=nomes.length-1; i>=0; i--) {
            System.out.println(nomes[i]);
        }

        System.out.println("\nVetor completo:");
        System.out.println(Arrays.toString(nomes));
    }
}
