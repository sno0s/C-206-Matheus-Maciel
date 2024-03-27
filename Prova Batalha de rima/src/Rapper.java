public class Rapper {
    String nome;
    float nota;
    int idade;
    Microfone microfone;

    public Rapper(java.lang.String nome, float nota, int idade, Microfone microfone) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
        this.microfone = microfone;
    }

    public void mostraInfo(){
        System.out.println("Nome do Rapper: " + this.nome);
        System.out.println("Nota do Rapper: " + this.nota);
        System.out.println("Idade do Rapper: " + this.idade);
    }


}
