package aula07.construtores;

public class Teste {

    public static void main(String[] args){

        Carro carro1 = new Carro();
        carro1.marca = "Kia";
        carro1.modelo = "Sportage";

        Carro carro2 = new Carro("Honda", "HRV");

        carro1.imprimir();
        carro2.imprimir();
    }
}
