import inatel.streamings.RedeSocial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Usuario extends HashSet {
    private String nome;
    private String email;
    public Set<RedeSocial> redesSociais = new HashSet<RedeSocial>();

    public Usuario(String nome, String email, Set<RedeSocial> redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }
}
