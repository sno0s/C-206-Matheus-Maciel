public class Oficial extends Soldado implements Defesa{

    //Atributos
    private String patente;

    //Construtor
    public Oficial(String nome, long cpf, String patente) {
        super(nome, cpf);
        this.patente = patente;
    }

    //Método para usar o item especial (caso tenha)
    @Override
    public void usandoItem() {
        if(itemespecial != null)
            System.out.println(this.getNome() + " utilizando item especial.");
        else
            System.out.println(this.getNome() + " sem item especial para usar.");
    }

    //Método de mostrar informações do Oficial
    @Override
    public void mostraInfo(){

        System.out.println("\nOficial: " + this.getNome());
        System.out.println("CPF do oficial: " + this.getCpf());

        if(this.getItemespecial() != null)
            System.out.println("Item especial: " + this.getItemespecial().tipo);
        else
            System.out.println("Oficial não tem item especial.");

        System.out.println("Patente do oficial: " + this.patente);
    }

    //Método implementado de defesa
    @Override
    public void Defender() {
        if(this.getItemespecial() != null)
            System.out.println(this.getNome() + " conseguiu se defender.");
        else
            System.out.println(this.getNome() + " não se defendeu");

    }
}