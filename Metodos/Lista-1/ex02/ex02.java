/**
2. Faça um programa que tenha um método que calcule o Índice de Massa Corpórea (IMC) 
de uma pessoa e mostre sua condição, dependendo do sexo e do resultado do cálculo do 
IMC. As entradas serão sexo, altura e peso. O método será sem retorno.
 * 
 */
import java.util.Scanner;
public class ex02 {

    public static void IMC(char s, double alt, double peso) {
        double res;

        res = peso / (alt * alt);

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
        double altura, peso;
        char sexo;

        do {
            System.out.println("Informe seu sexo: ");
            sexo = entrada.next().charAt(0);
        } while (sexo != 'F' && sexo != 'f' && sexo != 'M' && sexo != 'm');

        System.out.println("Informe sua altura: ");
        altura = entrada.nextDouble();

        System.out.println("Informe seu peso: ");
        peso = entrada.nextDouble();

        IMC(sexo, altura, peso);

    }
}
