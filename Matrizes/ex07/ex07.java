package ex07;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int m[][] = new int[3][3];

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("Digite o valor: ");
                m[l][c] = entrada.nextInt();
            }
        }

        System.out.println(" ");
        System.out.println("Matriz original");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(m[l][c]);
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("Matriz em 90º");
        for (int l = 0; l < 3; l++) {
            for (int c = 2; c >= 0; c--) {
                System.out.print(m[c][l]);
            }
            System.out.println(" ");
        }
    }
}
