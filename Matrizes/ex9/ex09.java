package ex9;

/* Faça um programa que preencha uma matriz 5 x 5 de caracteres e depois peça ao usuário para digitar 
uma letra. A letra digitada deverá ser buscada e mostre em quais posições a letra se encontra. Caso a 
letra não exista na matriz, o usuário deverá receber uma mensagem*/

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int m[][] = { { 'a', 'b', 'c', 'd', 'e' }, { 'a', 'b', 'g', 'd', 'e' }, { 'a', 'b', 'c', 'd', 'z' },
                { 'a', 'b', 'c', 'd', 'e' }, { 'c', 'b', 'c', 'd', 'a' } };
        char busca, bs;
        int cont = 0;

        System.out.print("Digite uma letra: ");
        busca = entrada.next().charAt(0);

        bs = Character.toLowerCase(busca);

        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                if (bs == m[l][c]) {
                    System.out.println(" ");
                    System.out.println("Letra (" + bs + ") está na linha " + (l + 1) + " da coluna " + (c + 1));
                } else {
                    cont++;
                }
            }
        }

        if (cont == 25) {
            System.out.println("Letra não existe na matriz!");
        }
    }
}
