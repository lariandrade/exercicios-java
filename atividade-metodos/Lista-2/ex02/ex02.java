/*
Faça um programa que tenha um método sem retorno que receba matriz de reais 
e calcule e mostre a somatória dos valores contidos na matriz.
*/
public class ex02 {

    static void calculaMatriz(double m[][]) {

        double soma = 0;

        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                soma = soma + m[l][c];
            }
        }

        System.out.println("Somátoria da matriz: " + soma);

    }

    public static void main(String[] args) {

        double matriz[][] = { { 2.1, 3.2, 21.90, 2.3, 2.5 }, 
        { 3.1, 3.4, 3.6, 3.2, 3.9 }, { 5.3, 15, 5.4, 5.4, 5.5 } };

        calculaMatriz(matriz);

    }
}
