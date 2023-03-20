package Revisão;

import java.util.Scanner;

public class atraso {
    public static void main(String[] args) {
        
        double valor, taxa, resul;
        int temp; 

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da prestação: ");
        valor = entrada.nextDouble();
        System.out.println("Digite a taxa de atraso: ");
        taxa = entrada.nextDouble();
        System.out.println("Digite o tempo de atraso: ");
        temp = entrada.nextInt();

        resul = valor + (valor * (taxa/100)* temp);

        System.out.println("A prestação de: " +valor+" foi para: "+resul+" devido taxa de atraso");
    }
}
