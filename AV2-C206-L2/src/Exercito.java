public class Exercito {
    //Nome do exército
    private String nome;
    //Criando a lista de soldados no exército
    private Soldado[] soldados = new Soldado[10];

    //Construtor
    public Exercito(String nome) {
        this.nome = nome;
    }

    //Método para adicionar soldados na lista de soldados
    public void addSoldado(Soldado soldado){
        for (int i = 0; i < soldados.length; i++) {
            if(soldados[i] == null){
                soldados[i] = soldado;
                break;
            }
        }
    }

    //Método que lista todos os soldados no exército
    public void mostraInfo(){
        System.out.println("\n----->Informações do exército: ");
        System.out.println("Nome do exército: " + this.nome);
        System.out.println("\n----->Listando todos os soldados: ");
        //Mostrando todos os soldados presentes no exército
        for (int i = 0; i < soldados.length; i++) {
            if(soldados[i] instanceof Oficial){
                soldados[i].mostraInfo();
            }
            if(soldados[i] instanceof Sargento){
                soldados[i].mostraInfo();
            }
            if(soldados[i] instanceof MedicoMilitar){
                soldados[i].mostraInfo();
            }

        }

    }

}