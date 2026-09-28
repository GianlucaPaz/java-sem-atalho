package reconstrucao.poo.abstracao.superclasse;

import java.math.BigDecimal;

// SUPERCLASSE ABSTRATA: Define a identidade base de qualquer Funcionário
abstract public class Funcionario {

    // 1. Atributos de estado compartilhados por toda a família
    private String nome;
    private BigDecimal salarioBase;

    // 2. Construtor para inicializar o estado básico
    public Funcionario(String nome, BigDecimal salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // 3. Métodos Getter
    public String getNome() {
        return nome;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    // 4. Método Concreto: Código comum REAPROVEITADO por todas as subclasses
    public void exibirCracha() {
        System.out.println("    - Crachá: " + nome + " | Salário Base: R$ " + salarioBase);
    }

    // 5. Método Abstrato: CONTRATO OBRIGATÓRIO que cada subclasse resolve à sua maneira
    public abstract BigDecimal calcularSalarioTotal();
}

/* O que faz ser uma Superclasse Abstrata?
 *
 *  1. Atributos e Estado: Pode declarar variáveis normais (protected String nome;) que serão herdadas por todas as subclasses.
 *
 *  2. Possui Construtor: Pode e deve ter um construtor chamado pelas subclasses via super(...).
 *
 *  3. Reaproveitamento de Código: Pode ter métodos concretos (com corpo {}) prontos para uso, evitando duplicar código nas subclasses.
 *
 *  4. Herança Única: No Java, uma classe só pode estender (extends) uma única superclasse abstrata.
 *
 *  5. Foco na Identidade: Une classes que pertencem estritamente à mesma família (DesenvolvedorJava e Gerente são Funcionarios).
 *
 *  Use Superclasse Abstrata se você quer criar um molde comum para classes do mesmo grupo compartilharem atributos e código (ex: Veiculo -> Carro, Moto).
 *
 */
