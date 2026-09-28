package reconstrucao.poo.associacao.composicao;

public class PrincipalComposicao {
    public static void main(String[] args) {

        // Criação do Edifício - Os apartamentos são gerados lá dentro automaticamente.
        Edificio predio = new Edificio("Rua das Flores", 10);

        System.out.println("   -> APARTAMENTO EXISTE");
        System.out.println("   - Endereço: " + predio.getEndereco());
        System.out.println("   - Número de apartamentos: " + predio.getApartamentos().size());
        for (Apartamento apartamento : predio.getApartamentos()) {
            System.out.println("   - Apartamento n°" + apartamento.getNumero());
        }
        System.out.println("");

        // Se o edifício for demolido (deixar de existir)...
        predio = null;

        // Os apartamntos são DESTRUÍDOS junto! Você não tem como acessar um Apartamento
        // porque ele só existia atrelado e encapsulado dentro daquele Edifício.
        System.out.println("   -> APARTAMENTO NÃO EXISTE MAIS");
        System.out.println("   - Apartamentos também deixam de existir!");
    }
}

