package ex06;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        Scanner entrada = new Scanner(System.in);
        int linha = 0, coluna = 0, somalinha = 0, somacoluna = 0;

        for (linha = 0; linha < matriz.length; linha++) {
            System.out.println("Informe a " + (linha + 1) + "ª linha da Matriz ");
            for (coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print("matriz  [" + linha + "][" + coluna + "] =  ");
                matriz[linha][coluna] = entrada.nextInt();
            }
        }
        System.out.println("");
        for (linha = 0; linha < matriz.length; linha++) {
            for (coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (linha == linha)
                    ;
                somalinha = matriz[linha].length;
                if (coluna == coluna)
                    ;
                somacoluna = matriz[coluna].length;

                System.out.print(matriz[linha][coluna]);

            }

        System.out.println("");
        }
        System.out.println("");
        for (linha = 0; linha < matriz.length; linha++) {
            for (coluna = 0; coluna < matriz[linha].length; coluna++)
                ;
            if (linha == coluna)
                System.out.print("A Diagonal da Matriz é igual a = " + matriz[linha][coluna] + " ");

        }

        System.out.println("A soma das linhas é igual a = " + somalinha);
        System.out.println("A soma das colunas é igual a = " + somacoluna);

    }
}
