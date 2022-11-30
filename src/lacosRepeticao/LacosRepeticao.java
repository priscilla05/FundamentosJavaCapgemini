package lacosRepeticao;

public class LacosRepeticao {

    public static void main(String[] args) {
        //Comando While - laço pré testado (entra antes de testar)
        System.out.println("Comando While");

        int qtdvezes = 1;

        while (qtdvezes <= 10) {
            System.out.println("Estou fazendo a" + qtdvezes + "ªvez");
            qtdvezes++;
        }
        System.out.println("Saí do laço e executei " + (qtdvezes - 1) + "vezes");

        //Do While- laço pós testado
        System.out.println("Comando Do...While");
        qtdvezes=1;
        do {
            System.out.println("Estou fazendo a" + qtdvezes+ "ªvez");
            qtdvezes++;
        } while (qtdvezes <= 10);
        System.out.println("Estou fazendo a" + qtdvezes+ " ªvez");

        //FOR
        System.out.println("Comando for");

        for (int i = 1; i <=10 ; i++) {
            System.out.println("estou fazendo a" +i +"ªvez");
            qtdvezes=i;

        }
        System.out.println("Saí do laço");
        for (int i = 1; i <=10 ; i++) {
            System.out.println("estou fazendo a" +i +"ªvez");
            if(i==5){
                System.out.printf("Parei!!!!");
                break;
            }

        }

    }
}