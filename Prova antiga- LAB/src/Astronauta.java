public abstract class Astronauta {

    private static int cont=0;
    public String cor;
    public String nome;
    private Skin skin;
    private Pet pet;

    public Astronauta(String cor, String nome, Skin skin, Pet pet) {
        this.cor = cor;
        this.nome = nome;
        this.skin = skin;
        this.pet = pet;
        cont+=1;
    }

    public Astronauta() {

    }

    abstract void mostraInfo();

    private void verCameras(){

    }
    protected abstract void reportar();
    protected abstract void reparar();

    public String getCor() {
        return cor;
    }

    public String getNome() {
        return nome;
    }

    public Skin getSkin() {
        return skin;
    }

    public Pet getPet() {
        return pet;
    }
}
