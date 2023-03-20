package Revisão;

import java.util.Scanner;

public class valores {
    public static void main(String[] args) {
       

        Scanner entrada = new Scanner(System.in);
        int val=0, soma=0, media=0, i=0;

        do {
            System.out.println("Digite um valor: ");
            val = entrada.nextInt();
            if (val > 0){
                soma = soma + val;
                i++;
            }   
            
        }
        while (val > 0); 

        media = soma/i;
       
        System.out.println("\nSoma dos valores: " +soma);
        System.out.println("Media dos valores: " + media);

    }
}