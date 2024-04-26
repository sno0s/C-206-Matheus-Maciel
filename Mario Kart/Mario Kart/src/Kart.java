public class Kart {
    String nome;
    Motor motor;

    Piloto piloto;

    //Construtor
    public Kart(){
        System.out.println("--Kart criado--");
        this.motor = new Motor();
    }
    void pular() {
        System.out.println("O kart pulou!");
    }
    void soltarTurbo() {
        System.out.println("O kart soltou turbo!");
    }
    void fazerDrift() {
        System.out.println("O Kart Está fazendo drift!");
    }
}
