package reconstrucao.excecao.naoverificada;

import java.util.Scanner;

public class VerificaCPF {

    // Método Verificador de CPF
    public static String verificaCPF(String cpf) {
        try {
            if (cpf.equals("00017127100")) {
                throw new RuntimeException("CPF já resgistrado: " + cpf);
            }
            else {
                return "CPF válido! Usuário cadastrado com sucesso!";
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("CPF já resgistrado: " + cpf);
        }
    }

    /*--------------------------------------------------------------------------------------*/

    // Método Main
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu CPF: ");
        String verificaCPF = verificaCPF(scanner.nextLine());
        System.out.println(verificaCPF);

    }
}
