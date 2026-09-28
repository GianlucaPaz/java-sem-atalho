package reconstrucao.poo.abstracao.superclasse;

import java.math.BigDecimal;

// SUBCLASSE CONCRETA 1: É-um Funcionário
public class DesenvolvedorJava extends Funcionario {

    // Atributos
    private BigDecimal bonusTecnico;

    // Construtor
    public DesenvolvedorJava(String nome, BigDecimal salarioBase, BigDecimal bonusTecnico) {
        super(nome, salarioBase);   // Reutiliza o construtor da superclasse
        this.bonusTecnico = bonusTecnico;
    }

    // Métodos Getter e Setter
    public BigDecimal getBonusTecnico() {
        return bonusTecnico;
    }

    public void setBonusTecnico(BigDecimal bonusTecnico) {
        this.bonusTecnico = bonusTecnico;
    }

    // Método abstrato herdado
    @Override
    public BigDecimal calcularSalarioTotal() {
        return getSalarioBase().add(bonusTecnico);  // Recebe bônus técnico
    }
}
