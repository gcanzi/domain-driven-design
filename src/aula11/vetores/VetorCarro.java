package aula11.vetores;

import aula11.model.Carro;

public class VetorCarro {

    public static void main(String[] args) {

        Carro[] carros = new Carro[3];

        carros[0] = new Carro("Carro1", 100.0);
        carros[1] = new Carro("Carro2", 200.0);
        carros[2] = new Carro("Carro3", 300.0);

        Carro maisRapido = carros[0];

        for (Carro carro : carros) {
            if (carro.getVelocidade() > maisRapido.getVelocidade()) {
                maisRapido = carro;
            }
        }

        System.out.println("O carro mais rapido é o " + maisRapido.getModelo());
    }
}