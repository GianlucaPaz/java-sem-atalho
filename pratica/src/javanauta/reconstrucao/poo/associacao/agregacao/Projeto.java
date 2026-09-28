package reconstrucao.poo.associacao.agregacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Projeto {

    // Atributos
    private String nomeProjeto;
    private List<Desenvolvedor> membrosProjeto; // AGREGAÇÃO

    // Construtor
    public Projeto(String nomeProjeto){
        this.nomeProjeto = nomeProjeto;
        this.membrosProjeto = new ArrayList<>();
    }

    // Métodos Getter e Setter

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public List<Desenvolvedor> getMembrosProjeto() {
        // Retorna uma visualização da lista que não permite .add(), .remove() ou .clear() por fora
        return Collections.unmodifiableList(membrosProjeto);
    }

    // Método que adiciona o desenvolvedor já existente na equipe
    public void adicionarDesenvolvedor(Desenvolvedor dev) {
        this.membrosProjeto.add(dev);
    }
}

