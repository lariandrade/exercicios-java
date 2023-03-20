package ex07;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "latin1");

        String nome, sobrenome;

        System.out.print("Digite seu Nome Completo: ");
        nome = entrada.nextLine();

        sobrenome = nome;
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome.substring(sobrenome.lastIndexOf(" ") + 1));
    }
}
