package ex04;

/*
• Calcule e mostre a média dos valores;
• Calcule e mostre a quantidade de valores acima da média calculada.

*/
import java.util.Scanner;
import java.util.ArrayList;

public class ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();
        char op;
        double N, soma = 0, media = 0;
        int lidos = 0, cont = 0;

        do {

            System.out.print("Digite uma nota: ");
            N = entrada.nextDouble();

            if (N != -1) {
                notas.add(N);
                lidos++;
                soma = soma + N;
            } else {
                System.out.println("Valor não aceito");
            }
            System.out.print("Deseja continuar? s/n: ");
            op = entrada.next().charAt(0);
        } while (op == 's' || op == 'S');

        media = soma / lidos;

        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) > media) {
                cont++;
            }
        }

        System.out.println("\nQuantidade de notas lidos: " + lidos);

        System.out.println("\nOrdem que as notas foram informados: ");

        for (int i = 0; i < notas.size(); i++) {
            System.out.print("[" + notas.get(i) + "]");
        }

        System.out.println("\nOrdem inversa das notas: ");
        for (int i = (lidos - 1); i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        System.out.println("\nSoma das notas: " + soma);
        System.out.println("\nMédia: " + media);
        System.out.println("\nQuantidade de notas acima da média: " + cont);
    }
}