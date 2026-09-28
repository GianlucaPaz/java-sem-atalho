package reconstrucao.poo.associacao.composicao;

import java.util.ArrayList;
import java.util.List;

public class Edificio {

    // Atributos
    private String endereco;
    private List<Apartamento> apartamentos; // COMPOSIÇÃO

    // Construtor
    public Edificio(String endereco, int qtdApartamentos) {
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();

        // O edifício cria seus próprios apartamentos ao nascer!
        for (int cont = 1; cont <= qtdApartamentos; cont++) {
            this.apartamentos.add(new Apartamento(cont));
        }
    }

    //Obs.: O objeto poderia ser passado por método set (caso o construtor não tivesse parâmetros)

    // Métodos Getter e Setter
    public String getEndereco() {
        return endereco;
    }

    public List<Apartamento> getApartamentos() {
        return apartamentos;
    }
}

