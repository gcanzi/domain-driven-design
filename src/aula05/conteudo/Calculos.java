package aula05.conteudo;

public class Calculos {

    public int soma(){
        return 5 + 3;
    }

    public int subtracao(){
        return soma() - 2;
    }

    public int divisao(){
        return subtracao() / 2;
    }

    public int multiplicacao(){
        return divisao() * 3;
    }

    public int modulo(){
        return multiplicacao() % 2;
    }
}
