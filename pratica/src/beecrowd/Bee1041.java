import java.util.Locale;
import java.util.Scanner;

public class Bee1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Digite o valor de x e y: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else if (x > 0.0 && y < 0.0) {
            System.out.println("Q4");
        }
        else if (x == 0.0 && y != 0.0) {
            System.out.println("Eixo Y");
        }
        else if (x != 0.0 && y == 0.0) {
            System.out.println("Eixo X");
        }
        else {
            System.out.println("Origem");
        }
        scanner.close();
    }
}
