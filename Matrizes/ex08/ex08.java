package ex08;

/**
 * ex08
 */

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int matrizA[][] = new int[4][4];
        int matrizB[][] = new int[4][4];
        int linha = 0, coluna = 0, somaA = 0, somaB = 0, res;

        for (linha = 0; linha < 4; linha++) {
            System.out.println("Informe a " + (linha + 1) + "ª linha da Matriz A");
            for (coluna = 0; coluna < 4; coluna++) {
                System.out.print("matriz A [" + linha + "][" + coluna + "] =  ");
                matrizA[linha][coluna] = entrada.nextInt();
            }
        }

        for (linha = 0; linha < 4; linha++) {
            System.out.println("Informe a " + (linha + 1) + "ª linha da Matriz B");
            for (coluna = 0; coluna < 4; coluna++) {
                System.out.print("matriz B [" + linha + "][" + coluna + "] = ");
                matrizB[linha][coluna] = entrada.nextInt();
            }
        }
        for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                somaA = somaA + matrizA[linha][coluna];
            }
        }

        for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                somaB = somaB + matrizB[linha][coluna];
            }
        }

        res = somaA + somaB;

        System.out.println("Soma das matrizes: " + res);

    }
}