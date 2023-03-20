package Revisão;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        int idade, qtd=0, media=0, resul=0;

        Scanner entrada = new Scanner(System.in);

        for(int i=1; i<=10; i++){
                       
            System.out.println("Digite a idade " + i+": ");
            idade = entrada.nextInt();
            media = media + idade;
                   
            if(idade>=18){
                qtd++;               
            }
        }
        resul = media/10;
        
        System.out.println("\nQuantidade de pessoas maior de idade: " +qtd);
        System.out.println("Média de idade do grupo: " +resul);

    }
}
