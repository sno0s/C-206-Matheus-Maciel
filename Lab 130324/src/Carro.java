public class Carro {
    String nome;
    String cor;
    int ano;

    Motor motor;

    public Carro(java.lang.String nome, java.lang.String cor, int ano, int cv) {
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
        this.motor = new Motor(cv);
    }
}
