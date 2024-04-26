import java.util.Scanner;
public class Cantina {
    String nome;
    Salgado salgados[] = new Salgado[3];

    public Cantina(java.lang.String nome) {
        this.nome = nome;
    }

    public void addsalgado(Salgado salgado){
        for (int i = 0; i < salgados.length; i++)
            if(salgados[i] == null){
                salgados[i] = salgado;
                break;
            }

    }

    public void mostrainfo(){
        System.out.println("Mostrando todos os salgados da cantina: ");
        for (int i = 0; i < salgados.length; i++)
            if(salgados[i] != null)
                System.out.println(salgados[i].nome);
    }




}
