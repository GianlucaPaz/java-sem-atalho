package reconstrucao.poo.associacao.agregacao;

public class PrincipalAgregacao {
    public static void main(String[] args) {

        // Criação dos desenvolvedores (fora da classe Projeto)
        Desenvolvedor dev1 = new Desenvolvedor("Gianluca");
        Desenvolvedor dev2 = new Desenvolvedor("Marcelo");

        // Criação da equipe
        Projeto projetoApp = new Projeto("RecycleApp");

        // Agrupamento (Agregação)
        projetoApp.adicionarDesenvolvedor(dev1);
        projetoApp.adicionarDesenvolvedor(dev2);

        System.out.println("-> PROJETO EXISTE");
        System.out.println("   - Nome do projeto: " + projetoApp.getNomeProjeto());
        for (Desenvolvedor dev : projetoApp.getMembrosProjeto()) {
            System.out.printf("   - Dev %d: %s%n", projetoApp.getMembrosProjeto().indexOf(dev) + 1, dev.getNome());
        }
        System.out.println("");

        // Se o projeto for cancelado e a equipe deixar de existir...
        projetoApp = null;

        System.out.println("-> PROJETO NÃO EXISTE MAIS");
        // Os desenvolvedores CONTINUAM existindo na memória!
        System.out.println("   - Desenvolvedores ainda existem apesar do fim do projeto!");
        System.out.println("   - Dev 1: " + dev1.getNome());
        System.out.println("   - Dev 2: " + dev2.getNome());
    }
}

