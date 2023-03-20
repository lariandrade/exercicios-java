/*
4. Faça um método que receba um valor inteiro e positivo, calcule e mostre o seu fatorial. O 
método terá que verificar se o número é positivo, para executar o cálculo. Método com
retorno. 
*/

import java.util.Scanner;

public class ex04 {

    static int calculaFat(int v) {
        int fatorial = 1;
        if (v < 0) {
            fatorial = 0;
        } else {
            for (int i = 1; i <= v; i++) {
                fatorial = fatorial * i;
            }
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, resp;

        System.out.print("Informe um valor positivo: ");
        valor = entrada.nextInt();

        calculaFat(valor);
        resp = calculaFat(valor);

        if (resp == 0) {

            System.out.println("O valor informado é negativo");

        } else {
            System.out.println("O fatorial de " + valor + "! é: " + resp);
        }

    }
}
