package reconstrucao.excecao.verificada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//C:\Users\PC\dev\estudos\Pasta Universal\Arquivo
public class LeitorDocumentos {
    public static void main(String[] args) {

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(
                    new FileReader("C:\\Users\\PC\\dev\\estudos\\pasta-universal\\arquivos-java-sem-atalhos\\Gandalf.txt"));

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
