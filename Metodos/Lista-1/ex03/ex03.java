/**
3. Refaça o exercício anterior, para que agora o programa tenha 2 métodos diferentes. Um 
método deverá apenas calcular o IMC (terá retorno) e outro método deverá receber esse 
valor de IMC e mostra a condição (sem retorno).
 * 
 */

import java.util.Scanner;
public class ex03 {

    public static double calculaIMC(double alt, double peso) {

        double res;
        res = peso / (alt * alt);

        return res;
    }

    public static void resultadoIMC(char s, double res) {
        if (s == 'f' || s == 'F') {
            if (res < 19.1) {
                System.out.println("Abaixo do peso");
            } else if (res >= 19.1 && res < 25.8) {
                System.out.println("No peso normal");
            } else if (res >= 25.8 && res < 27.3) {
                System.out.println("Marginalmente acima do peso");
            } else if (res >= 27.3 && res < 31.1) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obesidade");
            }
        } else {
            if (res < 20.7) {
                System.out.println("Abaixo do peso");
            } else if (res >= 20.7 && res < 26.4) {
                System.out.println("No peso normal");
            } else if (res >= 26.4 && res < 27.8) {
                System.out.println("Marginalmente acima do peso");
            } else if (res >= 27.8 && res < 32.3) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obesidade");
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura, peso, resultado;
        char sexo;

        do {
            System.out.println("Informe seu sexo: ");
            sexo = entrada.next().charAt(0);
        } while (sexo != 'F' && sexo != 'f' && sexo != 'M' && sexo != 'm');

        System.out.println("Informe sua altura: ");
        altura = entrada.nextDouble();

        System.out.println("Informe seu peso: ");
        peso = entrada.nextDouble();

        calculaIMC(altura, peso);
        resultado = calculaIMC(altura, peso);

        resultadoIMC(sexo, resultado);
    }
}
