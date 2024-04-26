public class Tripulante extends Astronauta implements Missao{
    public int QntMissoes = 10;

    public Tripulante() {
        super();
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

    public Tripulante(String cor, String nome, Skin skin, Pet pet) {
        super(cor, nome, skin, pet);
    }

    @Override
    protected void reportar() {
        System.out.println(this.nome + " reportou um corpo.");
    }

    @Override
    protected void reparar() {
        System.out.println(this.nome + " fez um reparo.");

    }

    @Override
    public void fazerMissao() {
        System.out.println(this.nome + " fez uma missao");
        QntMissoes-=1;
    }

    public int getQntMissoes() {
        return QntMissoes;
    }
}
