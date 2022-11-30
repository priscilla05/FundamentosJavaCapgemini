package poo;

public class Fisica extends Pessoa {
    public String nome, cpf, identidade;

    @Override
    public String toString() {
        return "Fisica{" + "nome='" + nome + '\'' + ", cpf='" + cpf + '\'' + ", identidade='" + identidade + '\'' +
                '}';
    }
}
