/*
Faça um programa que tenha um método com retorno que receba um vetor de 
inteiros e calcule a somatória dos valores contidos no vetor.
*/

public class ex01 {

    static int calculaVetor(int v[]) {

        int soma = 0;

        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];
        }

        return soma;
    }

    public static void main(String[] args) {

        int vetor[] = { 2, 5, 6, 1, 7, 2, 9 };
        int res;

        calculaVetor(vetor);
        res = calculaVetor(vetor);

        System.out.println("Somátoria do vetor: " + res);

    }
}