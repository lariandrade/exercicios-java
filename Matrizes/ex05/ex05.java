package ex05;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        double notasAlunos[][] = new double[10][5];
        Scanner entrada = new Scanner(System.in);
        int linha = 0, coluna = 0;
        double soma = 0, somaaluno = 0, mediaclasse = 0, aprovado = 0, reprovado = 0;

        for (linha = 0; linha < 10; linha++) {
            System.out.println("Informe as 5 notas do aluno " + (linha + 1) + " = ");
            for (coluna = 0; coluna < 5; coluna++) {
                System.out.print("[" + linha + "][" + coluna + "]: ");
                notasAlunos[linha][coluna] = entrada.nextDouble();
            }
        }

        for (linha = 0; linha < 10; linha++) {
            for (coluna = 0; coluna < 5; coluna++) {
                soma += notasAlunos[linha][coluna];
                somaaluno += notasAlunos[linha][linha];
                if (somaaluno > 6 | somaaluno == 6) {
                    aprovado++;
                    System.out.println("O aluno " + (linha + 1) + " está aprovado");
                } else {
                    reprovado++;
                    System.out.println("O aluno " + (linha + 1) + " está reprovado");
                }
            }
        }
    }
}
