package aula11.vetores;

import java.util.Arrays;

public class VetorInteiro {

    public static void main(String[] args){

        int[] vet1 = new int[5];
        vet1[0] = 10;
        vet1[1] = 20;
        vet1[2] = 30;
        vet1[3] = 40;
        vet1[4] = 50;

        int[] vet2 = {10, 20, 30, 40, 50};

        for(int i = 0; i < vet1.length; i++){
            System.out.println("O valor do vetor na posição " + i + " é: " + vet1[i]);
        }

        for(int vetInteiro : vet2){
            System.out.println("O valor do vetor é: " + vetInteiro);
        }

    }
}
