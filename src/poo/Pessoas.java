package poo;

public class Pessoas {

    public static void main(String[]args){

        Fisica fisica = new Fisica();

        fisica.nome = "Ana";
        fisica.cpf = "12541225414";
        fisica.identidade= "256987";
        fisica.situacaoPessoa = "A";

        Juridica juridica = new Juridica();
        juridica.nome = "Doceria da Hanah";
        juridica.cnpj = "669875441";
        juridica.inscEstadual= "554633";
        juridica.situacaoPessoa = "I";

        System.out.println("Dados da Pessoa Física");
        System.out.println(fisica.toString());

        System.out.println("Dados da Pessoa Jurídica");
        System.out.println(juridica.toString());
    }
}
