package fase1.tarefa3;

public class Item {

    // Atributos
    private String nome;
    private String categoria;
    private double valor;

    // Construtor
    public Item(String nome, String categoria, double valor){
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
    }

    // Métodos Getter
    public String getNome(){
        return nome;
    }

    public String getCategoria(){
        return categoria;
    }

    public double getValor(){
        return valor;
    }
}
