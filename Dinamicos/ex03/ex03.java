package ex03;

/*
Faça um programa que receba uma palavra (String) e a transforme em um 
vetor de caracteres. Após feito isso, atribua em um vetor dinâmico, que deverá 
exibir todos os caracteres em uma única frase. Isso deverá ocorrer até que o 
usuário decida parar. Exemplo:

Digite uma palavra: Programar
Deseja digitar mais uma palavra? (S ou N): S
Digite uma palavra: é
Deseja digitar mais uma palavra? (S ou N): S
Digite uma palavra: fácil
Deseja digitar mais uma palavra? (S ou N): N
Frase final: “Programar é fácil”

*/

import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        ArrayList<String> frase = new ArrayList<>();
        Scanner entrada = new Scanner(System.in, "latin1");
        char op;

        String palavra;

        do {
            System.out.print("Digite uma palavra: ");
            palavra = entrada.next();
            char vet[] = palavra.toCharArray();

            frase.add(String.copyValueOf(vet));

            System.out.print("Deseja continuar? s/n: ");
            op = entrada.next().charAt(0);

            frase.add(" ");
        } while (op == 's' || op == 'S');

        System.out.print("Frase final: ");
        for (int i = 0; i < frase.size(); i++) {
            System.out.print(frase.get(i));
        }
    }

}