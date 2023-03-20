package ex03;

/**
 * Faça um programa que preencha 2 vetores de 5 posições e some cada elemento de posição 
correspondente desses vetores, armazenando o resultado em outro vetor. Exemplo:
vetor1 [ 1, 2, 3, 4, 5] + vetor2 [ 6, 7, 8, 9, 10] = vetor3 [ 7, 9, 11, 13, 15]

 */
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int v1[] = new int[5];
        int v2[] = new int[5];
        int soma[] = new int[5];

        
        System.out.println("\nPreencha o primeiro vetor!");
        for(int i = 0; i < 5; i++ ){
            System.out.println("Digite o valor "+(i+1)+":");
            v1[i] = entrada.nextInt();
        }  

        System.out.println("\nPreencha o segundo vetor!");

        for(int i = 0; i < 5; i++ ){
            System.out.println("Digite o valor "+(i+1)+":");
            v2[i] = entrada.nextInt();
        } 

        
        System.out.println("\nValores digitados no primeiro vetor:");

        for(int i = 0; i < 5; i++ ){
            System.out.print("["+v1[i]+"]");
        } 

        
        System.out.println("\nValores digitados no segundo vetor:");

        for(int i = 0; i < 5; i++ ){
            System.out.print("["+v2[i]+"]");
        } 

        System.out.println("\nSoma dos valores:");
        for(int i = 0; i < 5; i++ ){
            soma[i] = v1[i]+v2[i];
            System.out.print("["+soma[i]+"]");
        } 
    }
}