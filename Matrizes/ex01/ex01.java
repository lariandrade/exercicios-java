package ex01;

/* Faça um programa que preencha uma matriz 3 x 5 com números inteiros, calcule e mostre a soma 
de todos os elementos dessa matriz.
*/

public class ex01 {
    public static void main(String[] args) {

        int m[][] = { { 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2 }, { 2, 2, 2, 2, 2 } };
        int soma = 0;

        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                soma = soma + m[l][c];
            }
        }
        System.out.print("Soma: " + soma);
    }
}
