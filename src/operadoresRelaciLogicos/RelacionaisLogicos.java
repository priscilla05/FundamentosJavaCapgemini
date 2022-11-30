package operadoresRelaciLogicos;

public class RelacionaisLogicos {

    public static void main(String[] args) {
        //Operadores Relacionais > < <= >= != ==

        int num1, num2;

        //Testando uma igualdade
        num1 = 10;
        num2 = 10;

        if (num1 == num2) {
            System.out.println("Numero 1 e numero 2 são iguais");
        }
        //testando uma desigualdade
        num1 = 10;
        num2 = 30;

        if (num1 != num2) {
            System.out.println("Numero 1 e numero 2 são diferentes");
        }
        //testando maior
        num1 = 10;
        num2 = 10;

        if (num1 > num2) {
            System.out.println("Numero 1 é maior que numero 2");

        } else {
            System.out.println("Numero 2 é maior que numero 1");
        }

        //Operadores Lógicos
        //&&= and / || = ou
        num1 = 10;
        num2 = 5;
        int  num3 = 20;
        int num4 = 5;

        if ((num1 > num3) && (num2 == num4)){
            System.out.println("Primeira oção satisfeita");
        }else{
            System.out.println("Segunda opção satisfeita");
        }
        if ((num1 > num3) || (num2 == num4)){
            System.out.println("Primeira oção satisfeita");
        }else{
            System.out.println("Segunda opção satisfeita");
        }

    }
}
