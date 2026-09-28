package reconstrucao.poo.abstracao.interfaces;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalAutenticavel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // Criação de UsuarioSystem e CatracaEletronica
        UsuarioSystem userGianluca = new UsuarioSystem("123456");
        CatracaEletronica catracaEmpresa = new CatracaEletronica("1234");
        boolean senha = false;
        boolean pin = false;

        // Testando Classe 1
        System.out.println("-> USUÁRIO SYSTEM");
        while (!senha) {
            System.out.println("   |");
            System.out.print("   -> Digite a senha: ");
            senha = userGianluca.autenticar(scanner.nextLine());

            if (!senha) {
                System.out.println("   -> # SENHA INCORRETA!");
            }
        }
        System.out.println("   -> # SENHA CORRETA!");

        System.out.println("=================================");

        // Testando Classe 2
        System.out.println("-> CATRACA ELETRÔNICA");
        while (!pin) {
            System.out.println("   |");
            System.out.print("   -> Digite o pin: ");
            pin = catracaEmpresa.autenticar(scanner.nextLine());

            if (!pin) {
                System.out.println("   -> # PIN INCORRETO!");
            }
        }
        System.out.println("   -> # PIN CORRETO!");
        scanner.close();
    }
}
