package fase0;

import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {

        //Tarefa 2: Lê 5 números digitados e imprime a soma
        //Resultado esperado: usa Scanner e um laço

        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int cont = 1; cont < 6; cont++) {
            System.out.print("Digite o " + cont + "° número: ");
            int numero = scanner.nextInt();
            soma = soma + numero;
        }
        System.out.println("---------------");
        System.out.println("Soma dos números: " + soma);
    }
}
