public class Main {
    public static void main(String[] args) {

        Piloto piloto1;
        piloto1 = new Piloto();

        piloto1.nome = "Matheus";
        piloto1.vilao = false;
        Kart kart1 = new Kart();

        //agregando o kart à um piloto
        kart1.piloto = piloto1;



    }
}
