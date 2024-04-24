public class Main {
    public static void main(String[] args) {
        //Criando o exército
        Exercito exercito = new Exercito("Exército de Manaus");

        //Criando os tipos de itens especiais
        ItemEspecial desfribilador = new ItemEspecial("Desfribilador");
        ItemEspecial facaMilitar = new ItemEspecial("Faca Militar");

        //Criando um soldado de cada tipo e seus itens especiais (caso tenham)
        Soldado medico = new MedicoMilitar("Matheus Maciel", 133923822, 10, 1 );
        medico.setItemespecial(desfribilador);
        Soldado oficial = new Oficial("Giuliana", 1028485432, "SS++");
        //oficial sem item especial.
        Soldado sargento = new Sargento("João Victor", 840223411,"Operações Especiais",100);
        sargento.setItemespecial(facaMilitar);

        //Adicionando os soldados no exercito
        exercito.addSoldado(medico);
        exercito.addSoldado(oficial);
        exercito.addSoldado(sargento);

        //Fazendo as ações do médico
        System.out.println("\n------>Ações Médico:");
        MedicoMilitar auxMedico = (MedicoMilitar)medico;
        auxMedico.usandoItem();
        auxMedico.curar();
        auxMedico.setAnosExperiencia(100);
        auxMedico.setCapacidadeEmergencia(10000);
        auxMedico.curar();

        //fazendo as ações do oficial
        System.out.println("\n------>Ações Oficial:");
        Oficial auxOficial = (Oficial)oficial;
        auxOficial.usandoItem();
        auxOficial.Defender();

        //fazendo as ações do Sargento
        System.out.println("\n------>Ações Sargento:");
        Sargento auxSargento = (Sargento)sargento;
        auxSargento.usandoItem();
        auxSargento.Defender();

        exercito.mostraInfo();

        //Mostrando a quantidade total de soldados
        System.out.println("\nQuantidade de soldados: " + Soldado.qtdSoldado);


    }
}