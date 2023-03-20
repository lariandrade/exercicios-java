package ex01;

/*
Suponha um vetor com 15 valores inteiros. Mostre a soma de todos esses valores e a média
desses valores.
*/

public class ex01 {
    public static void main(String[] args) {

        int vetor[] = {25, 73, 94, 5, 6, 17, 12, 15, 45, 210, 21, 50, 23, 52, 68};
        int soma=0;
        float media=0;


        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        media = (float) soma/15;
        
        System.out.println("\nSoma: " +soma);
        System.out.println("\nMedia: " + media);
    }
}