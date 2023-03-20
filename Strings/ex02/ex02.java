package ex02;

/*
Desenvolva um programa que receba o nome do usuário e depois mostre as letras, separadamente, uma 
abaixo da outra
*/

import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

    }
}
