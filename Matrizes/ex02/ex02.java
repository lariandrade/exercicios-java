package ex02;

/*
Faça um programa que preencha uma matriz 3 x 3 com entradas do usuário, só que ao invés de 
preencher linha-a-linha, deverá ser preenchido coluna-a-coluna.
*/

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int m[][] = new int[3][3];

        System.out.println("Preencha a primeira coluna: ");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 1; c++) {
                System.out.print("m[" + l + "][" + c + "]:");
                m[l][c] = entrada.nextInt();
            }
        }

        System.out.println("Preencha a segunda coluna: ");
        for (int l = 0; l < 3; l++) {
            for (int c = 1; c < 2; c++) {
                System.out.print("m[" + l + "][" + c + "]:");
                m[l][c] = entrada.nextInt();
            }
        }

        System.out.println("Preencha a terceira coluna: ");
        for (int l = 0; l < 3; l++) {
            for (int c = 2; c < 3; c++) {
                System.out.print("m[" + l + "][" + c + "]:");
                m[l][c] = entrada.nextInt();
            }
        }
        
        System.out.println("Valores inseridos: ");
        for(int c = 0; c < m[0].length; c++){ 
            for(int l = 0; l < m.length; l++){
                System.out.print(m[c][l]+" "); 
            }
            System.out.println(""); 
        }
    }
}
