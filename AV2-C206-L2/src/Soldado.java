public abstract class Soldado {

    public static int qtdSoldado;
    private String nome;
    private long cpf;

    public ItemEspecial itemespecial;

    public Soldado(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        qtdSoldado+=1;
    }

    public ItemEspecial getItemespecial() {
        return itemespecial;
    }

    public void setItemespecial(ItemEspecial itemespecial) {
        this.itemespecial = itemespecial;
    }

    public void mostraInfo(){
        System.out.println("");
    }

    public abstract void usandoItem();

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }
}