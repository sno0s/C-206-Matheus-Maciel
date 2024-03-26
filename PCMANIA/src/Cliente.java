public class Cliente {
    String nome;
    long cpf;

    float valortotal;

    public Cliente(java.lang.String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente() {
    }
    public float calculaTotalCompra(float compra){
        this.valortotal += compra;
        return this.valortotal;
    }


}
