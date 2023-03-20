package ex05;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[10];
        int maior = 0, menor = 1000000;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posição " + (i + 1) + " :");
            vetor[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            } else if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("Maior valor do vetor: " + maior);
        System.out.println("Menor valor do vetor: " + menor);
    }
}
