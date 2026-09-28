import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee1042 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Digite 3 valores inteiros: ");
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();

        // Lista original
        final List<Integer> LISTA_VALORES_ORIGINAIS = new ArrayList<>();

        LISTA_VALORES_ORIGINAIS.add(valor1);
        LISTA_VALORES_ORIGINAIS.add(valor2);
        LISTA_VALORES_ORIGINAIS.add(valor3);

        // Cópia ordenada da lista
        List<Integer> listaValoresOrdenados = new ArrayList<>(LISTA_VALORES_ORIGINAIS);
        listaValoresOrdenados.sort(null);

        //Saída ordenada de forma crescente
        for (int valor : listaValoresOrdenados) {
            System.out.println(valor);
        }
        System.out.println("");

        //Saída original
        for (int valor : LISTA_VALORES_ORIGINAIS) {
            System.out.println(valor);
        }
    }
}
