package inatel.streamings;
import inatel.interfaces.Compartilhamento;
public class Twitter extends RedeSocial implements Compartilhamento {

    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Twitter!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um vídeo no Twitter!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentário no Twitter!");
    }

    @Override
    public void Compartilhar() {
        System.out.println("compartilhou um vídeo no Twitter!");
    }
}
