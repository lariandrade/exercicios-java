package Revisão;

import java.util.Scanner;

public class semestre {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int mat, n1, n2, n3, freq, media = 0, ap = 0, rep = 0, mediaGeral = 0, res, menor=0, maior=0;


        for (int i = 0; i <= 9; i++) {

            System.out.println("Informa o número da matricula: ");
            mat = entrada.nextInt();
            System.out.println("Digite a primeira nota: ");
            n1 = entrada.nextInt();
            System.out.println("Digite a segunda nota: ");
            n2 = entrada.nextInt();
            System.out.println("Digite a terceira nota: ");
            n3 = entrada.nextInt();
            System.out.println("Informa sua frequencia: ");
            freq = entrada.nextInt();

            media = (n1 + n2 + n3) / 3;
            
            mediaGeral = mediaGeral + media;

            if (media >= 6 && freq >= 75) {
                System.out.println("\nMatrícula: " + mat);
                System.out.println("Frequência: " + freq);
                System.out.println("Matrícula: " + media);
                System.out.println("Aprovado");
                System.out.println("\n");
                ap++;
            } else {
                rep++;
            }

            if(media > media){
               maior = media;
            } else {
                menor = media;
            }
        }

        res = mediaGeral / 10;

        System.out.println("Menor média: " + menor);
        System.out.println("Maior média: " + maior);
        System.out.println("Média geral da turma: " + res);
        System.out.println("Números de aprovados: " + ap);
        System.out.println("Números de reprovados: " + rep);

    }

}
