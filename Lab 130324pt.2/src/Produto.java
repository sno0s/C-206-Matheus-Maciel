public class Produto {

    //Atributos do produto
    String nome;
    int nota;
    //Composição com o Fabricante
    Fabricante fabricante;
    int quantidade;

    public Produto(java.lang.String nome, int nota, String nomefab, int cnpj, int quantidade) {
        this.nome = nome;
        this.nota = nota;
        this.fabricante = new Fabricante(nomefab, cnpj);
        this.quantidade = quantidade;
    }

    public void mostrainfo(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Nota do produto: " + this.nota);
        System.out.println("Quantidade do produto: " + this.quantidade);
        System.out.println("-------------Informações do fabricante: ");
        System.out.println("Nome do fabricante: " + this.fabricante.nome);
        System.out.println("CNPJ do fabricante: " + this.fabricante.cnpj);

    }
}
