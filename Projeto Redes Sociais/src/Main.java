import inatel.exceptions.CadastroIncompletoException;
import inatel.streamings.*;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        Random random = new Random();

        //declarando hashset de redes sociais

        Set<RedeSocial> redesSociais = new HashSet<RedeSocial>();

        //criando redes sociais

        Instagram insta = new Instagram("123", 23);
        GooglePlus google = new GooglePlus("234", 72);
        Facebook face = new Facebook("5767238", 133);
        Twitter twitter = new Twitter("asdfasd", 78456);

        //adicionando no hashset

        redesSociais.add(face);
        redesSociais.add(twitter);
        redesSociais.add(insta);
        redesSociais.add(google);


        //criando novo usuario
        Usuario user = new Usuario("Matheus Maciel", "maathdesigner@outlook.com", redesSociais);

        //mostrando ações em redes sociais

        boolean postarfoto = false;
        boolean postarvideo = false;
        boolean postarcomentario = false;
        boolean compartilhar = false;
        boolean fazerstreaming = false;
        boolean curtirpublicacao = false;
        int limite = 5;

        for(RedeSocial elemento : user.redesSociais){

            if(elemento instanceof Instagram){
                for (int i = 0; i < 3; i++) {
                    if(!postarfoto){
                        elemento.postarFoto();
                        postarfoto = true;
                    }
                    else if (!postarvideo) {
                        elemento.postarVideo();
                        postarvideo = true;
                    }
                    else if (!postarcomentario){
                        elemento.postarComentario();
                        postarcomentario = true;
                    }
                    else if (!curtirpublicacao)
                    {
                        elemento.CurtirPublicacao();
                        curtirpublicacao = true;
                    }
                }
            }

            if(elemento instanceof GooglePlus){
                for (int i = 0; i < 3; i++) {
                    if (!fazerstreaming){
                        ((GooglePlus) elemento).fazStreaming();
                        fazerstreaming = true;
                    }
                    else if (!compartilhar){
                        ((GooglePlus) elemento).Compartilhar();
                        compartilhar = true;
                    }
                    else if(!postarfoto){
                        elemento.postarFoto();
                        postarfoto = true;
                    }
                    else if (!postarvideo) {
                        elemento.postarVideo();
                        postarvideo = true;
                    }
                    else if (!postarcomentario){
                        elemento.postarComentario();
                        postarcomentario = true;
                    }
                    else if (!curtirpublicacao)
                    {
                        elemento.CurtirPublicacao();
                        curtirpublicacao = true;
                    }
                }
            }

            if(elemento instanceof Facebook){
                for (int i = 0; i < 3; i++) {
                    if (!fazerstreaming){
                        ((Facebook) elemento).fazStreaming();
                        fazerstreaming = true;
                    }
                    else if (!compartilhar){
                        ((Facebook) elemento).Compartilhar();
                        compartilhar = true;
                    }
                    else if(!postarfoto){
                        elemento.postarFoto();
                        postarfoto = true;
                    }
                    else if (!postarvideo) {
                        elemento.postarVideo();
                        postarvideo = true;
                    }
                    else if (!postarcomentario){
                        elemento.postarComentario();
                        postarcomentario = true;
                    }
                    else if (!curtirpublicacao)
                    {
                        elemento.CurtirPublicacao();
                        curtirpublicacao = true;
                    }
                }
            }

            if(elemento instanceof Twitter){
                for (int i = 0; i < 3; i++) {
                    if (!compartilhar){
                        ((Twitter) elemento).Compartilhar();
                        compartilhar = true;
                    }
                    else if(!postarfoto){
                        elemento.postarFoto();
                        postarfoto = true;
                    }
                    else if (!postarvideo) {
                        elemento.postarVideo();
                        postarvideo = true;
                    }
                    else if (!postarcomentario){
                        elemento.postarComentario();
                        postarcomentario = true;
                    }
                    else if (!curtirpublicacao)
                    {
                        elemento.CurtirPublicacao();
                        curtirpublicacao = true;
                    }
                }
            }


        }


    }
}
