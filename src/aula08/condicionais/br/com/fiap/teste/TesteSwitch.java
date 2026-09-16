package aula08.condicionais.br.com.fiap.teste;

public class TesteSwitch {

    public static void main(String args[]) {

        char opcao = 'A';

        switch (opcao) {
            case 'A':
                System.out.println("A opção escolhida é A");
                break;
            case 'B':
                System.out.println("A opção escolhida é B");
                break;
            case 'C':
                System.out.println("A opção escolhida é C");
                break;

            default:
                System.out.println("Opção default");
                break;
        }


    }
}