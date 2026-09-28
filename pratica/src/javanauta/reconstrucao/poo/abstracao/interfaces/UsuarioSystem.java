package reconstrucao.poo.abstracao.interfaces;

// CLASSE 1: Um usuário humano
public class UsuarioSystem implements Autenticavel{

    // Atributos
    private String senhaSecreta;

    // Construtor
    public UsuarioSystem (String senhaSecreta) {
        this.senhaSecreta = senhaSecreta;
    }

    // Método Getter
    public String getSenhaSecreta () {
        return senhaSecreta;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senhaSecreta.equals(senha);
    }
}
