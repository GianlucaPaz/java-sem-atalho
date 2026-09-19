package fase1.tarefa3;

public class Principal {
    public static void main(String[] args) {
        Item biscoito = new Item("Biscoito", "comida", 3.50);
        Item camera = new Item("Câmera", "tecnologia", 275.50);

        System.out.println(biscoito.getNome() + " e " + camera.getNome());
    }
}
