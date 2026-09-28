import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Bee1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //Exercício BEE 1040 - Média 3

        Scanner scanner = new Scanner(System.in);

        //Leitura das notas
//        System.out.print("Digite as quatro notas do aluno: ");
        BigDecimal nota1 = scanner.nextBigDecimal();
        BigDecimal nota2 = scanner.nextBigDecimal();
        BigDecimal nota3 = scanner.nextBigDecimal();
        BigDecimal nota4 = scanner.nextBigDecimal();

        //Inicialização dos pesos
        BigDecimal peso1 = new BigDecimal("2");
        BigDecimal peso2 = new BigDecimal("3");
        BigDecimal peso3 = new BigDecimal("4");
        BigDecimal peso4 = new BigDecimal("1");
        BigDecimal somaPesos = new BigDecimal("10");

        //Média ponderada: ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / (2 + 3 + 4 + 1)
        BigDecimal somaPonderada = nota1.multiply(peso1)
                .add(nota2.multiply(peso2))
                .add(nota3.multiply(peso3))
                .add(nota4.multiply(peso4));
        BigDecimal mediaPonderada = somaPonderada.divide(somaPesos, 1, RoundingMode.DOWN);

        //Saída da média do aluno
        System.out.printf("Media: %.1f%n", mediaPonderada);

        /*Avaliação da situação do aluno*/

        //Inicialização das notas de corte
        BigDecimal limiteAprovacao = new BigDecimal("7.0");
        BigDecimal limiteReprovacao = new BigDecimal("5.0");

        if (mediaPonderada.compareTo(limiteReprovacao) < 0) {       //Média < 5.0
            System.out.println("Aluno reprovado.");
        }
        else if (mediaPonderada.compareTo(limiteAprovacao) < 0) {   //Média >= 5.0 && Média <= 6.9 (< 7.0)
            System.out.println("Aluno em exame.");

//            System.out.print("Digite a nota do aluno no exame: ");
            BigDecimal notaExame = scanner.nextBigDecimal();
            System.out.printf("Nota do exame: %.1f%n", notaExame);

            //Nova Média: (notaExame + mediaPonderada) / 2
            BigDecimal novaMedia = notaExame.add(mediaPonderada).divide(new BigDecimal("2"), 1, RoundingMode.DOWN);

            if (novaMedia.compareTo(limiteReprovacao) < 0) {        //Média < 5.0
                System.out.println("Aluno reprovado.");
            }
            else {
                System.out.println("Aluno aprovado.");              //Média >= 5.0
            }

            //Saída da média final do aluno
            System.out.printf("Media final: %.1f%n", novaMedia);
        }
        else {
            System.out.println("Aluno aprovado.");                  //Média >= 7.0
        }
        scanner.close();
    }
}
