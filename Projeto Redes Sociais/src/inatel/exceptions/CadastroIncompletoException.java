package inatel.exceptions;

public class CadastroIncompletoException extends RuntimeException{
    public CadastroIncompletoException(String message){
        message = "Usuário ou senha incompletos, tente novamente.";
    }

}
