import inatel.exceptions.CadastroIncompletoException;
import inatel.exceptions.UsuarioJaCriadoException;
import inatel.exceptions.UsuarioSemRedeSocialException;
import inatel.streamings.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);
        Usuario user = new Usuario();

        //declarando hashset de redes sociais
        Set<RedeSocial> redesSociais = new HashSet<RedeSocial>();

        while(running){
            System.out.println("Bem vindo ao projeto de redes sociais, escolha uma das opções abaixo: \n(1)Criar usuário\n(2)Cadastrar rede social\n(3)Mostrar redes sociais\n(4)sair");
            int choice = entrada.nextInt();

            switch(choice){
                case 1:
                    //Criando novo usuário e tratando os erros que são:
                    //criar mais de um usuário (não posso fazer isso)
                    //criar um usuario sem nome ou sem email
                    //criar um usuario sem redes sociais

                    try {
                        user = UserInterfaceFunctions.criarUsuario(redesSociais);
                    } catch (CadastroIncompletoException | UsuarioJaCriadoException | UsuarioSemRedeSocialException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    //Cadastrando redes sociais e tratando erros:
                    try{
                        redesSociais = UserInterfaceFunctions.criarRede(user,redesSociais);
                    } catch (CadastroIncompletoException | InputMismatchException e){
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3:
                    //mostrando redes sociais e tratando possíveis erros
                    try{
                        UserInterfaceFunctions.MostrarRedes(user, redesSociais);
                    }catch (UsuarioSemRedeSocialException e){
                        //catch para caso o usuário não tenha nenhuma rede social cadastrada.
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    //Finalizando o programa.
                    running = false;
                    break;
            }
        }
    }
}
