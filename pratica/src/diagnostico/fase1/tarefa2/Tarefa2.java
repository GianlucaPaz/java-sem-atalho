package fase1.tarefa2;

import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_DE_NUMEROS = 5;
        int soma = 0;

        for(int cont = 1; cont <= TOTAL_DE_NUMEROS; cont++){
            System.out.printf("Digite o %d° número: ", cont);
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("Soma: " + soma);
        scanner.close();
    }
}
