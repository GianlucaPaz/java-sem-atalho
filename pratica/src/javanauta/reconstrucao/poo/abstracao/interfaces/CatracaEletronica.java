package reconstrucao.poo.abstracao.interfaces;

// CLASSE 2: Um dispositivo físico de segurança (Hardware)
public class CatracaEletronica implements Autenticavel {

    // Atributos
    private String pinMestre;

    // Construtor
    public CatracaEletronica (String pinMestre) {
        this.pinMestre = pinMestre;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.pinMestre.equals(senha);
    }
}
