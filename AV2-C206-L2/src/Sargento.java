public class Sargento extends Soldado implements Defesa{

    //Atributos
    private String especializacao;
    private int experienciaCombate;

    //Construtor
    public Sargento(String nome, long cpf, String especializacao, int experienciaCombate) {
        super(nome, cpf);
        this.experienciaCombate = experienciaCombate;
        this.especializacao = especializacao;
    }

    //Adicionando mais 300 pontos no sargento caso ele tenha um item especial
    @Override
    public void setItemespecial(ItemEspecial itemespecial) {
        this.itemespecial = itemespecial;
        experienciaCombate = experienciaCombate + 300;
    }

    //Método para usar o item especial (caso tenha)
    @Override
    public void usandoItem() {
        if(itemespecial != null)
            System.out.println(this.getNome() + " utilizando item especial.");
        else
            System.out.println(this.getNome() + "Sem item especial para usar.");
    }

    //Método de mostrar infos do Sargento
    @Override
    public void mostraInfo(){
        System.out.println("\nSargento: " + this.getNome());
        System.out.println("CPF do sargento: " + this.getCpf());

        if(this.getItemespecial() != null)
            System.out.println("Item especial: " + this.getItemespecial().tipo);
        else
            System.out.println("Oficial não tem item especial.");

        System.out.println("Especialização do Sargento: " + this.especializacao);
        System.out.println("Experiencia de combate do Sargento: " + this.experienciaCombate);
    }

    //Método implementado de defesa
    @Override
    public void Defender() {
        if(this.experienciaCombate > 650)
            System.out.println(this.getNome() + " conseguiu se defender.");
        else
            System.out.println(this.getNome() + " não se defendeu");
    }
}