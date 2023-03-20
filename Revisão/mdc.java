package Revisão;

import java.util.Scanner;
public class mdc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int divisor, dividendo, c=0, n1, n2;

        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();

        if(n2>n1){
            dividendo = n2;
            divisor = n1;
        } else {
            dividendo = n1;
            divisor = n2;
        }

       while((dividendo/divisor) !=0){
           c = (dividendo/divisor);
           dividendo = divisor;
           divisor = c;
       }
       System.out.println("O divisor é: " + divisor);
    }
}
