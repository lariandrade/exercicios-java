package ex01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double vetor1[] = new double[3];
        double vetor2[] = new double[3];
        double vetor3[] = new double[6];

        double soma1 = 0.0, soma2 = 0.0;
        int cont = 3;

        System.out.println("Primeiro Vetor!");

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite o valor da posição " + (i + 1) + ": ");
            vetor1[i] = entrada.nextDouble();
            soma1 = soma1 + vetor1[i];
        }

        System.out.println("Segundo Vetor!");

        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Digite o valor da posição " + (i + 1) + ": ");
            vetor2[i] = entrada.nextDouble();
            soma2 = soma2 + vetor2[i];
        }

        if (soma2 > soma1) {
            
            for (int i = 0; i < 3; i++) {
               vetor3[i] = vetor2[i];
               vetor3[cont] = vetor1[i];
               cont++;
            }
        } else if (soma1 > soma2) {
            
            for (int i = 0; i < 3; i++) {
               vetor3[i] = vetor1[i];
               vetor3[cont] = vetor2[i];
               cont++;
            }
        }

        for (int i = 0; i < vetor3.length; i++) {
            System.out.print("["+ vetor3[i]+"]");
        }

    }
}
