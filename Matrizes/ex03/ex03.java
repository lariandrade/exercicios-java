package ex03;

/*
Faça um programa que preencha uma matriz 2 x 4 com números inteiros, calcule e mostre:
• A quantidade de elementos pares, em cada linha da matriz;
• A média dos elementos pares da matriz.
*/

public class ex03 {
    public static void main(String[] args) {

        int m[][] = { { 4, 4, 7, 5 }, { 2, 0, 11, 15 } };

        int linha1 = 0, linha2 = 0, soma = 0;
        float media = 0;

        for (int l = 0; l < 1; l++) {
            for (int c = 0; c < 4; c++) {
                if (m[l][c] % 2 == 0) {
                    linha1++;
                    soma = soma + m[l][c];
                }
            }
        }

        for (int l = 1; l < 2; l++) {
            for (int c = 0; c < 4; c++) {
                if (m[l][c] % 2 == 0) {
                    linha2++;
                    soma = soma + m[l][c];
                }
            }
        }

        media = (float) soma / (linha1 + linha2);

        System.out.println("Pares na linha 1: " + linha1);
        System.out.println("Pares na linha 2: " + linha2);
        System.out.println("Media dos numeros pares: " + media);
    }
}
