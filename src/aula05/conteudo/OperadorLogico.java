package aula05.conteudo;

public class OperadorLogico {

    public static void main(String[] args) {

        boolean expr1 = false;
        boolean expr2 = true;

        System.out.println("Comparação utilizando o operador logico && as variaveis " + expr1
                + " com a " + expr2 + " o resultado é " + (expr1 && expr2));

        System.out.println("Comparação utilizando o operador logico || as variaveis " + expr1
                + " com a " + expr2 + " o resultado é " + (expr1 || expr2));

        System.out.println("Comparação utilizando o operador logico && com ! as variaveis " + expr1
                + " com a " + expr2 + " o resultado é " + (!expr1 && expr2));

    }
}
