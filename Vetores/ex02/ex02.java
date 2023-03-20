package ex02;

/*
Altere o exercício anterior para que o usuário informa a quantidade de valores que deseja inserir, 
insira esses valores e mostre a quantidade de valores pares e ímpares existentes no vetor.
*/

import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int val, par=0, impar=0;

        System.out.println("Quantidade de valores que deseja inserir: ");
        val = entrada.nextInt();
        

        int vetor[] = new int[val];
        System.out.println("\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor " + (i + 1) + ":");
            vetor[i] = entrada.nextInt();
            if(vetor[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("\nValores pares: " +par);
        System.out.println("\nValores impares: " + impar);
    }
}
