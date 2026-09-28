package reconstrucao.poo.abstracao.superclasse;

import java.math.BigDecimal;

public class PrincipalFuncionario {
    public static void main(String[] args) {

        // Criação do Desenvolvedor e Gerente
        DesenvolvedorJava gianluca = new DesenvolvedorJava("Gianluca", new BigDecimal("4500.00"), new BigDecimal("1200.00"));
        Gerente marcelo = new Gerente("Marcelo", new BigDecimal("7600.00"), new BigDecimal("1.5"));

        // Uso do método concreto
        System.out.println(" -> CRACHÁS DE IDENTIFICAÇÃO");
        gianluca.exibirCracha();
        marcelo.exibirCracha();

        System.out.println("===================================================");

        // Uso do método abstrato
        System.out.println(" -> SALÁRIO TOTAL");
        System.out.printf("    - Gianluca: R$ %.2f%n", gianluca.calcularSalarioTotal());
        System.out.printf("    - Marcelo: R$ %.2f%n", marcelo.calcularSalarioTotal());
    }
}
