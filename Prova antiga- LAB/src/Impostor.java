public class Impostor extends Astronauta implements Missao, Sabotar, Executar{
    public int qtdMortes = 0;

    public Impostor(String cor, String nome, Skin skin, Pet pet) {
        super(cor, nome, skin, pet);
    }

    @Override
    void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        if(getPet()!=null)
            System.out.println("Skin: " + getPet().nome);
        else
            System.out.println("Sem pet.");
        if(getSkin()!=null)
            System.out.println("Skin: " + getSkin().tipo);
        else
            System.out.println("Sem skin.");

    }

    private void usarVentoinha(){
        System.out.println(" O impostor se escondeu na ventilação");
    }

    private void trancarPortas(String local){
        System.out.println("O impostor trancou as portas do(a) " + local);
    }

    @Override
    protected void reportar() {
        System.out.println(this.nome + " fez um self report");
    }

    @Override
    protected void reparar() {
        System.out.println(this.nome + " fingiu que fez um reparo.");
    }

    @Override
    public void fazerMissao() {
        System.out.println(this.nome + " fez uma tarefa falsa");
    }

    @Override
    public void executar() {
        System.out.println(this.nome + " matou um tripulante");
        qtdMortes+=1;
    }

    @Override
    public void sabotarLuz() {
        System.out.println( "O impostor sabotou a luz.");
    }

    @Override
    public void sabotarOxigenio() {
        System.out.println( "O impostor sabotou o oxigenio.");
    }

    @Override
    public void sabotarReator() {
        System.out.println( "O impostor sabotou o reator.");
    }

    @Override
    public void sabotarComunicacao() {
        System.out.println( "O impostor sabotou a comunicação.");
    }

    public int getQtdMortes() {
        return qtdMortes;
    }
}
