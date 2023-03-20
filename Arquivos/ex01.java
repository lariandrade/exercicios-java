package Arquivos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ex01 {
    public static void main(String[] args) {
        String nome, ra, nota1, nota2, nota3;

        double media, n1, n2, n3;
        try {

            File file = new File("turma.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileReader ler = new FileReader("turma.txt");
            BufferedReader reader = new BufferedReader(ler);
            String linha;
            String dados[];
            
            while ((linha = reader.readLine()) != null) {
                dados = linha.split("\\|");
                ra = dados[0];
                nome = dados[1];
                nota1 = dados[2];
                nota2 = dados[3];
                nota3 = dados[4];

                n1 = Double.parseDouble(nota1);
                n2 = Double.parseDouble(nota2);
                n3 = Double.parseDouble(nota3);

                media = (n1 + n2 + n3) / 3;

                System.out.print("RA: " + ra + " ");
                System.out.print("NOME: " + nome + " ");
                System.out.printf("MEDIA: %.2f ", (media));

                if (media >= 8.5) {
                    System.out.println(" EXCELENTE");
                } else if ((media >= 7.0) && (media < 8.5)) {
                    System.out.println(" BOM");
                } else if ((media >= 5.0) && (media < 7.0)) {
                    System.out.println(" REGULAR");
                } else {
                    System.out.println(" PREOCUPANTE");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
