package reconstrucao.poo.abstracao.superclasse;

import java.math.BigDecimal;

public class Gerente extends Funcionario {

    // Atributos
    private BigDecimal comissao;

    // Construtor
    public Gerente(String nome, BigDecimal salarioBase, BigDecimal comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    // Métodos Getter e Setter
    public BigDecimal getComissao() {
        return comissao;
    }

    public void setComissao(BigDecimal comissao) {
        this.comissao = comissao;
    }

    // Método abstrato herdado
    @Override
    public BigDecimal calcularSalarioTotal() {
        return getSalarioBase().multiply(comissao);    // Recebe 50% de comissão
    }
}
