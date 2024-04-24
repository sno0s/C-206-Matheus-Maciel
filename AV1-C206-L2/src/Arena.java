public class Arena {
    String nome;
    String lugar;

    Rapper rappers[] = new Rapper[10];


    public void addRapper(Rapper rapper){
        for (int i = 0; i < rappers.length; i++) {
            if(rappers[i] == null){
                rappers[i] = rapper;
                break;
            }

        }
    }
    public void mostraInfo(){
        int verificacao=0;
        System.out.println("---Mostrando informações da Arena.");
        System.out.println("Nome da Arena: " + this.nome);
        System.out.println("Local da Arena: " + this.lugar);
        System.out.println("---Mostrando todos os rappers cadastrados na arena: ");

        for (int i = 0; i < rappers.length; i++) {
            if(rappers[i] == null)
                verificacao = verificacao;
            else{
                System.out.println("Rapper " + i);
                rappers[i].mostraInfo();
                verificacao++;
            }
        }
        if(verificacao==0)
            System.out.println("Nenhum rapper foi adicionado à arena.");
    }

    public void microfoneDou(){
        int verificacao = 0;
        System.out.println("---Mostrando todos os rappers com microfone dourado.\n");
        for (int i = 0; i < rappers.length; i++) {
            if(rappers[i] != null){
                if(rappers[i].microfone != null){
                    if(rappers[i].microfone.material.equals("Dourado")){
                        rappers[i].mostraInfo();
                        verificacao++;
                    }
                }
            }

        }
        //Esse if verifica se teve primeiramente algum rapper na lista, se não, essa mensagem sai
        if(verificacao==0)
            System.out.println("Nenhum rapper tem microfone dourado.");

    }

    public void ranking(){
        float menor;
        float maior;
        int vencedor = 0;
        int perdedor = 0;

        maior = -1;
        menor = 11;
        //lógica de maior e menor básica
        for (int i = 1; i < rappers.length; i++) {
            if(rappers[0]!= null){
                maior = rappers[0].nota;
                menor = rappers[0].nota;
            }
            if(rappers[i] != null && rappers[i].nota > maior)
                vencedor = i;
            else if(rappers[i] != null && rappers[i].nota < menor)
                perdedor = i;
        }

        System.out.println("Rapper que ganhou a batalha: \n");
        rappers[vencedor].mostraInfo();
        System.out.println("Rapper que ficou em último lugar na batalha: \n");
        rappers[perdedor].mostraInfo();

    }
}
