package ex02;

/*
Altere o exercício anterior para que os valores sejam organizados dentro do 
vetor em forma crescente. Dica: pesquise sobre algoritmos de ordenação, como 
bubblesort ou quicksort
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        char op;
        int soma = 0, media, valor;

        do {
            System.out.print("Digite um valor: ");
            valor = entrada.nextInt();
            valores.add(valor);
            soma = soma + valor;

            System.out.print("Deseja continuar? s/n: ");
            op = entrada.next().charAt(0);
        } while (op == 's' || op == 'S');

        Collections.sort(valores);

        media = soma / valores.size();

        System.out.println("Ordem crescente: " + valores);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média: " + media);
    }
}
