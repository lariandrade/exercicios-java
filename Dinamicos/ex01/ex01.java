package ex01;

/**
 * Faça um programa que receba um número indeterminado de valores que serão
 * inseridos pelo usuário e irão preencher um vetor dinâmico, perguntando se
 * deve fazer uma nova inserção ou de deve encerrar. Quando encerrado a
 * inserção, deverá ser exibido a soma e a média dos valores inseridos.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        char op;
        int soma = 0, media, valor;

        do {
            System.out.println("Digite um valor: ");
            valor = entrada.nextInt();

            valores.add(valor);
            soma = soma + valor;

            System.out.println("Deseja continuar? s/n: ");
            op = entrada.next().charAt(0);
        } while (op == 's' || op == 'S');

        media = soma / valores.size();

        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média: " + media);
    }

}