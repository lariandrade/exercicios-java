package Revisão;

import java.util.Scanner;

public class media {
  public static void main(String[] args) {

    double n1, n2, media;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite a primeira nota: ");
    n1 = entrada.nextDouble();
    System.out.println("Digite a segunda nota: ");
    n2 = entrada.nextDouble();

    media = (n1+n2)/2.0;

    if(media <= 3.9) {
        System.out.println("Reprovado. Sua média foi: " + media);
    } else if (media >= 4.0 && media <= 6.9){
        System.out.println("Exame. Sua média foi: " + media);
    } else {
        System.out.println("Aprovado. Sua média foi: " + media);
    }

  }  
}