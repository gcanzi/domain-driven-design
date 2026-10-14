package aula11.exercicios.desafio;

public class Exercicio01 {

    public static void main(String[] args){

        int[] vet = {20, 30, 10, 50, 60, 80, 70, 55};

        int maior = vet[0];
        int menor = vet[0];
        int posicao = vet[0];
        int soma = 0;

        for(int i=0; i<vet.length; i++){
            if(vet[i] > maior){
                maior = vet[i];
                posicao = i;
            }
            if(vet[i] < menor){
                menor = vet[i];
            }

            soma += vet[i];
        }

        System.out.println("A soma do vetor é " + soma);
        System.out.println("A media é " + (soma/vet.length));
        System.out.println("O menor valor é " + menor + " e o maior é " + maior
                + " no indice " + posicao);

    }
}
