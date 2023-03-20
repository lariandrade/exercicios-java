package ex10;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        double matriz[][] = new double[3][4];
        Scanner entrada = new Scanner(System.in);
        int linha = 0, coluna = 0;

        for (linha = 2; linha >= 0; linha--) {
            System.out.println("Preencha a matriz com a " + (linha + 1) + "ª linha = ");
            for (coluna = 3; coluna >= 0; coluna--) {
                System.out.print("[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = entrada.nextDouble();
            }
        }

    }
}
