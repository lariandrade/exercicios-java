package Revisão;

import java.util.Scanner;

public class operacoes {
    public static void main(String[] args) {
        int n1, n2, op, resul;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        n1 = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        n2 = entrada.nextInt();

        System.out.println("\n1 - A média entre dois números.");
        System.out.println("2 - A diferença do maior pelo menos.");
        System.out.println("3 - O produto entre os dois números.");
        System.out.println("\nInforme o número da opção que deseja");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                resul = (n1 + n2) / 2;
                System.out.println("A média entre os números é: " + resul);
                break;
            case 2: 
                if(n1>n2){
                    resul = n1-n2;
                    System.out.println("A diferença entre os números é: " + resul);
                } else {
                    resul = n2-n1;
                    System.out.println("A diferença entre os números é: " + resul);
                }
                break;
            case 3:
                resul = n1*n2;
                System.out.println("A média entre os números é: " + resul);
                break;
            case 4:
                System.out.println("Opção inválida.");
                break;
        }

    }
}
