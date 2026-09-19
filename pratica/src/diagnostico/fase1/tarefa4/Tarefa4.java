package fase1.tarefa4;

import fase1.tarefa3.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Tarefa4 {
    public static void main(String[] args) {
        Item arroz = new Item("Arroz", "comida", 25.90);
        Item sabao = new Item("Sabão", "limpeza", 12.50);
        Item feijao = new Item("Feijão", "comida", 9.80);
        Item detergente = new Item("Detergente", "limpeza", 3.20);
        Item cafe = new Item("Café", "comida", 18.00);

        List<Item> listaDeItens = new ArrayList<>(List.of(arroz, sabao, feijao, detergente, cafe));

        for(Item item : listaDeItens){
            System.out.printf(Locale.US, "%s - %s - %.2f%n", item.getNome(), item.getCategoria(), item.getValor());
        }
    }
}
