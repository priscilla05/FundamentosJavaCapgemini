package condicionais;

public class ComandoCondicional {
    public static void main(String[] args) {
        //IF

        int num1 = 10, num2 = 30;
        if (num1 < num2) {
            System.out.println("if sozinho Numero 1 é menor que numero 2");
        }
        //IF/ELSE
        if (num1 > num2) {
            System.out.println("If com else Numero 1 é maior que numero 2");
        } else {
            System.out.println("If com else Numero 1 é menor que numero 2");

        }
        if (num1 > num2) {
            System.out.println("Condição composta1 -Numero 1 é maior que numero 2");
        } else if (num1 < num2) {
            System.out.println("Condição composta2-Numero 1 é menor que numero 2");

        } else {
            System.out.println("Condição composta3-Numero 1 é igual ao numero 2");
        }

        //comando condicional switch
        char opcao = '4';
        switch (opcao) {

            case '1': {
                System.out.println("Chame programa de inclusão");
                break;
            }
            case '2': {
                System.out.println("Chame programa de Alteração");
                break;

            }
            case '3': {
                System.out.println("Chame programa de Exclusão");
                break;
            }

            case '4': {
                System.out.println("Chame programa de Consulta");
                break;
            }
        }


    }
}

