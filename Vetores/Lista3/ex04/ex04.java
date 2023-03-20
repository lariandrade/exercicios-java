package ex04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double[] vetOrginal = new double[10];
        double[] vetCopia = new double[3];
        int indice = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira valores reais " +(i+1)+ ": "); 
            vetOrginal[i] = entrada.nextDouble();
        }
        do {
            if (indice > 7) {
                System.out.println("\nÍndice inválido!");
                System.out.println("Insira um índice menor que 8!");
            }

            System.out.print("\nEscolha um índice de 0 a 9: "); 
            indice = entrada.nextInt();
        } while (indice > 7);

        for (int i = 0; i < 3; i++) {

            vetCopia[i] = vetOrginal[indice]; 
            indice++; 
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(vetCopia[i] + " ");
        }
    }
}
