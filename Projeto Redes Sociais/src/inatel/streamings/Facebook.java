package inatel.streamings;
import inatel.interfaces.VideoConferencia;
import inatel.interfaces.Compartilhamento;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {


    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um vídeo no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentário no Facebook!");
    }

    @Override
    public void Compartilhar() {
        System.out.println("compartilhou um vídeo no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("fez um streaming no Facebook!");
    }
}
