/*
Faça um programa que tenha um método que receba uma matriz. Nesse método 
teremos que mostrar a soma da diagonal principal e a soma de cada linha
*/
public class ex03 {
    static void somaMatriz(int m[][]) {

        int somaDiagonal = 0, somaL1 = 0, somaL2 = 0, somaL3 = 0;

        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                if (l == c) {
                    somaDiagonal = somaDiagonal + m[l][c];
                }
            }
        }

        System.out.println("Soma da diagonal principal: " + somaDiagonal);

        for (int l = 0; l < 1; l++) {
            for (int c = 0; c < 3; c++) {
                somaL1 = somaL1 + m[l][c];
            }
        }
        System.out.println("Soma da linha 1: " + somaL1);

        for (int l = 1; l < 2; l++) {
            for (int c = 0; c < 3; c++) {
                somaL2 = somaL2 + m[l][c];
            }
        }
        System.out.println("Soma da linha 2: " + somaL2);

        for (int l = 2; l <= 2; l++) {
            for (int c = 0; c < 3; c++) {
                somaL3 = somaL3 + m[l][c];
            }
        }
        System.out.println("Soma da linha 3: " + somaL3);

    }

    public static void main(String[] args) {

        int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        somaMatriz(matriz);
    }
}
