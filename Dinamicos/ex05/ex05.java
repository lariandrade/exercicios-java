package ex05;

/*
Faça um programa que pergunte ao usuário quantos elementos ele quer 
visualizar da sequência de Fibonacci. Os números dessa sequência deverão ser 
calculados e armazenados em um vetor dinâmico. Também deverá ser exibido 
em tela os números da sequência. Exemplo:
Digite a quantidade de elementos para a sequência: 12
Sequência de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> fibonacci = new ArrayList<>();
        int quantidade;

        fibonacci.add(0);
        fibonacci.add(1);

        int num1 = 1, num2 = 0;

        System.out.print("Digite a quantidade de elementos para a sequência: ");
        quantidade = entrada.nextInt();

        quantidade = quantidade - 2;
       

        for (int i = 0; i < quantidade; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;

            fibonacci.add(num1);
        }

        System.out.print("Sequência de Fibonacci: ");
        for (int i = 0; i < fibonacci.size(); i++) {
            System.out.print(fibonacci.get(i) + " ");
        }

    }
}
