package Revisão;

import java.util.Scanner;

public class peso {
   public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    double altura, calc;
    char sexo;

    System.out.println("Digite seu sexo [F] ou [M]:");
    sexo = entrada.next().charAt(0);

    System.out.println("Digite sua altura: ");
    altura = entrada.nextDouble();

    if(sexo == 'M' || sexo == 'm'){
        calc = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + calc);
    } else if (sexo == 'F' || sexo == 'f'){
        calc = (62.1 * altura) - 44.7;
        System.out.println("Seu peso ideal é: " + calc);
    } else {
        System.out.println("Opção inválida");
    }

   }
}
