package ex05;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[5];
        int vetor2[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor: ");
            vetor[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = vetor[i];
        }

        System.out.println("\nVetor Original: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }

        System.out.println("\nVetor Cópia: ");
        for (int i = 4; i >= 0; i--)
            System.out.print("[" + vetor2[i] + "]");
    }
}
