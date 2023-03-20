package ex03;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[9];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posição " + (i + 1) + " :");
            vetor[i] = entrada.nextInt();
        }

        System.out.println("Vetor inverso");

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print("[" + vetor[i] + "]");
        }
    }
}
