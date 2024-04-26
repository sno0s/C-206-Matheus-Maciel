public class Main {
    public static void main(String[] args) {

        //Criando o vetor de jogadores
        Astronauta[] players = new Astronauta[10];
        //criando os pets e as skins de cada um
        Pet pet1 = new Pet("Cachorro");
        Pet pet2 = new Pet("Pato");
        Pet pet3 = new Pet("cavalo");
        Skin skin1 = new Skin("Roupa preta");
        Skin skin2 = new Skin("Roupa branca");
        Skin skin3 = new Skin("Roupa azul");
        //criando um tripulante e um impostor para os colocar em um vetor.
        Astronauta tripulante = new Tripulante("Marrom", "sno0s", skin1, pet1);
        Astronauta impostor = new Impostor("Vermelho", "v1tin", skin2, pet2);
        Astronauta impostor2 = new Impostor("Azul", "jhoncy", skin3, pet3);
        //todos os jogadores colocados no vetor de jogadores
        players[0] = tripulante;
        players[1] = impostor;
        players[2] = impostor2;

        for (int i = 0; i < players.length; i++) {
            if(players[i] instanceof Tripulante){
                //criando um auxiliar para fazer o uso da interface
                Tripulante auxTripulante = (Tripulante)players[i];
                //mostrando todas as ações de um tripulante
                auxTripulante.reparar();
                auxTripulante.reportar();
                auxTripulante.fazerMissao();
                auxTripulante.mostraInfo();
                System.out.println("Missões a fazer: " + auxTripulante.getQntMissoes());
            }
            if(players[i] instanceof Impostor){
                Impostor auxImpostor = (Impostor)players[i];

                auxImpostor.reparar();
                auxImpostor.reportar();
                auxImpostor.fazerMissao();
                auxImpostor.sabotarLuz();
                auxImpostor.sabotarOxigenio();
                auxImpostor.sabotarComunicacao();
                auxImpostor.sabotarReator();
                auxImpostor.executar();

                System.out.println(auxImpostor.getNome() + " executou " + auxImpostor.getQtdMortes());
                auxImpostor.mostraInfo();

            }
        }


    }
}