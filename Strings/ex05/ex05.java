package ex05;

import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        String numeros;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        numeros = entrada.nextLine();

        for (int i = 0; i < numeros.length(); i++)
            System.out.printf("%s ", converteNumEscrito(numeros.charAt(i)));

        System.out.println();
    }

    public static String converteNumEscrito(char num) {
        String[] numero = { "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove" };
        int index = 0;

        switch (num) {
        case '0':
            index = 0;
            break;
        case '1':
            index = 1;
            break;
        case '2':
            index = 2;
            break;
        case '3':
            index = 3;
            break;
        case '4':
            index = 4;
            break;
        case '5':
            index = 5;
            break;
        case '6':
            index = 6;
            break;
        case '7':
            index = 7;
            break;
        case '8':
            index = 8;
            break;
        case '9':
            index = 9;
        }
        return numero[index];

    }
}
