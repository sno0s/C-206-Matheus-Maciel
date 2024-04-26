public class Empresa {
    String nome;
    //Criando um array para salvar os produtos.
    Produto[] produtos = new Produto[10];

    public Empresa(java.lang.String nome) {
        this.nome = nome;
    }

    public void mostrainfo(){
        System.out.println("Nome da empresa: " + this.nome);
        System.out.println("------Produtos cadastrados: \n");

        for (int i = 0; i < produtos.length; i++)
            if(produtos[i]!= null)
                produtos[i].mostrainfo();

    }

    public void adicionaprod(Produto produto){

        for (int i = 0; i < produtos.length; i++)
            if(produtos[i]== null)
            {
                produtos[i] = produto;
                break;
            }






    }
}
