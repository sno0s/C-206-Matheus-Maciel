import inatel.exceptions.CadastroIncompletoException;
import inatel.exceptions.UsuarioJaCriadoException;
import inatel.exceptions.UsuarioSemCadastroException;
import inatel.exceptions.UsuarioSemRedeSocialException;
import inatel.streamings.*;
import java.util.Scanner;
import java.util.Set;

public class UserInterfaceFunctions {
    private static boolean já_criado = false;


    public static Usuario criarUsuario(Set<RedeSocial> redesSociais) {
        if (!já_criado) {
            if (redesSociais.isEmpty())
                throw new UsuarioSemRedeSocialException("\n---->Nenhuma rede social criada, crie uma e continue o cadastro.\n");
            else {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Digite o nome de usuário e senha: ");
                String nome = entrada.nextLine();
                String email = entrada.nextLine();
                if (nome.isEmpty() | nome.isEmpty())
                    throw new CadastroIncompletoException("\n---->Nome ou email incompletos, tente novamente.\n");
                else {
                    já_criado = true;
                    return new Usuario(nome, email, redesSociais);
                }
            }
        } else {
            throw new UsuarioJaCriadoException("\n---->Usuário já criado.\n");
        }
    }

    public static void MostrarRedes(Usuario user, Set<RedeSocial> redesSociais) {
        //iniciando as variáveis para que não seja possível mostrar ações repetidas

        user.redesSociais = redesSociais;
        boolean postarfoto = false;
        boolean postarvideo = false;
        boolean postarcomentario = false;
        boolean compartilhar = false;
        boolean fazerstreaming = false;
        boolean curtirpublicacao = false;
        //tratando o erro de caso não exista rede social a ser mostrada.
        if(redesSociais.isEmpty())
            throw new UsuarioSemRedeSocialException("\n---->Usuário ainda não cadastrou nenhuma rede social.\n");
        else {
            System.out.println("\n--->Mostrando ações das redes sociais:");
            for (RedeSocial elemento : user.redesSociais) {

                if (elemento instanceof Instagram) {
                    for (int i = 0; i < 3; i++) {
                        if (!postarfoto) {
                            elemento.postarFoto();
                            postarfoto = true;
                        } else if (!postarvideo) {
                            elemento.postarVideo();
                            postarvideo = true;
                        } else if (!postarcomentario) {
                            elemento.postarComentario();
                            postarcomentario = true;
                        } else if (!curtirpublicacao) {
                            elemento.CurtirPublicacao();
                            curtirpublicacao = true;
                        }
                    }
                }

                if (elemento instanceof GooglePlus) {
                    for (int i = 0; i < 3; i++) {
                        if (!fazerstreaming) {
                            ((GooglePlus) elemento).fazStreaming();
                            fazerstreaming = true;
                        } else if (!compartilhar) {
                            ((GooglePlus) elemento).Compartilhar();
                            compartilhar = true;
                        } else if (!postarfoto) {
                            elemento.postarFoto();
                            postarfoto = true;
                        } else if (!postarvideo) {
                            elemento.postarVideo();
                            postarvideo = true;
                        } else if (!postarcomentario) {
                            elemento.postarComentario();
                            postarcomentario = true;
                        } else if (!curtirpublicacao) {
                            elemento.CurtirPublicacao();
                            curtirpublicacao = true;
                        }
                    }
                }

                if (elemento instanceof Facebook) {
                    for (int i = 0; i < 3; i++) {
                        if (!fazerstreaming) {
                            ((Facebook) elemento).fazStreaming();
                            fazerstreaming = true;
                        } else if (!compartilhar) {
                            ((Facebook) elemento).Compartilhar();
                            compartilhar = true;
                        } else if (!postarfoto) {
                            elemento.postarFoto();
                            postarfoto = true;
                        } else if (!postarvideo) {
                            elemento.postarVideo();
                            postarvideo = true;
                        } else if (!postarcomentario) {
                            elemento.postarComentario();
                            postarcomentario = true;
                        } else if (!curtirpublicacao) {
                            elemento.CurtirPublicacao();
                            curtirpublicacao = true;
                        }
                    }
                }

                if (elemento instanceof Twitter) {
                    for (int i = 0; i < 3; i++) {
                        if (!compartilhar) {
                            ((Twitter) elemento).Compartilhar();
                            compartilhar = true;
                        } else if (!postarfoto) {
                            elemento.postarFoto();
                            postarfoto = true;
                        } else if (!postarvideo) {
                            elemento.postarVideo();
                            postarvideo = true;
                        } else if (!postarcomentario) {
                            elemento.postarComentario();
                            postarcomentario = true;
                        } else if (!curtirpublicacao) {
                            elemento.CurtirPublicacao();
                            curtirpublicacao = true;
                        }
                    }
                }
            }
        }
        System.out.println("");
    }

    public static Set<RedeSocial> criarRede(Usuario user, Set<RedeSocial> redesSociais) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de amigos e a senha: ");

        int numAmigos = entrada.nextInt();
        entrada.nextLine();
        String senha = entrada.nextLine();

        if (senha.isEmpty())
            throw new CadastroIncompletoException("Senha ou número de amigos não pode ser vazio.");
        else if(user.isEmpty())
            throw new UsuarioSemCadastroException("Usuario ainda não cadastrado");
        else {
            System.out.println("Tipo da rede social:\n(1)Instagram\n(2)GooglePlus\n(3)Twitter\n(4)Facebook");
            int escolha = entrada.nextInt();

            switch(escolha){
                case 1:
                    Instagram insta = new Instagram(senha, numAmigos);
                    redesSociais.add(insta);
                    break;
                case 2:
                    GooglePlus goog = new GooglePlus(senha, numAmigos);
                    redesSociais.add(goog);
                    break;
                case 3:
                    Twitter twitter = new Twitter(senha, numAmigos);
                    redesSociais.add(twitter);
                    break;
                case 4:
                    Facebook face = new Facebook(senha, numAmigos);
                    redesSociais.add(face);
                    break;
            }

        }


        return redesSociais;
    }
}