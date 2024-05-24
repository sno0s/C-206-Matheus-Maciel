package inatel.streamings;

import inatel.interfaces.Compartilhamento;
import inatel.interfaces.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um vídeo no GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentário no GooglePlus!");
    }

    @Override
    public void Compartilhar() {
        System.out.println("compartilhou um vídeo no GooglePlus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("fez um streaming no GooglePlus!");
    }
}
