public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Fusca", "Azul", 2000, 80);

        System.out.println("Nome do carro: " + carro1.nome);
        System.out.println("Cor do carro: " + carro1.cor);
        System.out.println("Ano do carro: " + carro1.ano);
        System.out.println("Motor do carro: " + carro1.motor.cv);

        //losango preenchido = composição
        //não preenchido = agregação
    }
}