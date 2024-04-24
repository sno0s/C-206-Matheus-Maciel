public class MedicoMilitar extends Soldado implements Curar{

    //Atributos
    private int anosExperiencia;
    private int capacidadeEmergencia;

    //Construtor
    public MedicoMilitar(String nome, long cpf, int anosExperiencia, int capacidadeEmergencia) {
        super(nome, cpf);
        this.anosExperiencia = anosExperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    //Método para usar o item especial (caso tenha)
    @Override
    public void usandoItem() {
        if(itemespecial!= null)
            System.out.println(this.getNome() + " utilizando item especial.");
        else
            System.out.println(this.getNome() + "Sem item especial para usar.");
    }

    //Caso o medico militar tenha um item especial, capacidade emergencia aumentada em 100
    @Override
    public void setItemespecial(ItemEspecial itemespecial) {
        this.itemespecial = itemespecial;
        capacidadeEmergencia = capacidadeEmergencia + 100;
    }

    //Método de mostrar informações do Médico
    @Override
    public void mostraInfo(){
        System.out.println("\nMedico: " + this.getNome());
        System.out.println("CPF do médico: " + this.getCpf());

        if(this.getItemespecial() != null)
            System.out.println("Item especial: " + this.getItemespecial().tipo);
        else
            System.out.println("Oficial não tem item especial.");

        System.out.println("Anos de experiencia: " + this.anosExperiencia);
        System.out.println("Capacidade de emergencia: " + this.capacidadeEmergencia);
    }

    //Método de cura implementado
    @Override
    public void curar() {
        if(this.capacidadeEmergencia > 920)
            System.out.println(this.getNome() + " curou um aliado.");
        else
            System.out.println(this.getNome() + " não conseguiu curar um aliado.");
    }

    //Setters usados.
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void setCapacidadeEmergencia(int capacidadeEmergencia) {
        this.capacidadeEmergencia = capacidadeEmergencia;
    }
}