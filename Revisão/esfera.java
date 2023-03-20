package Revisão;

import java.util.Scanner;
import java.lang.Math;

public class esfera {
     public static void main(String[] args) {
         double raio, comp, area, vol;
         final double pi = 3.1416;

         Scanner entrada = new Scanner(System.in);

         System.out.println("Digite o raio da esfera: ");
         raio = entrada.nextDouble();

         comp = 2 * pi * raio;
         area = pi * Math.pow(raio, 2);
         vol = (3 * pi * Math.pow(raio, 3))/4;

         System.out.println("\tInformações da esfera.");
         System.out.println("Comprimento: " + comp);
         System.out.println("Área: " + area);
         System.out.println("Volume: " + vol);
     }
}
