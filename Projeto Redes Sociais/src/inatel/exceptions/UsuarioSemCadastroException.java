package inatel.exceptions;

public class UsuarioSemCadastroException extends RuntimeException{
    public UsuarioSemCadastroException(String message){
        super(message);
    }

}
