/*
Faça um programa que um método que busca um valor dentro de um vetor. Para 
isso o método deverá receber o vetor e o valor a ser buscado. Caso o valor se encontre 
no vetor, mostrar em qual índice ele se encontra. Caso não exista esse valor no vetor, 
mostrar essa informação. Método sem retorno.
*/

import java.util.Scanner;
public class ex04 {

    static void procuraValor(int vet[], int val) {

        int cont = 0;

        for (int i = 0; i < vet.length; i++) {
            if (val == vet[i]) {
                System.out.println("Posição: " + i);

            } else {
                cont++;
            }
        }

        if (cont == vet.length) {
            System.out.println("Valor não existe no vetor!");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[] = { 2, 5, 6, 2, 1 };

        int valor;

        System.out.print("Digite um valor: ");
        valor = entrada.nextInt();

        procuraValor(vetor, valor);

    }

}
