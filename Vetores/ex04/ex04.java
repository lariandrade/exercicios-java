package ex04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[100];
        int num = 0, limite = 0, soma = 0, media=0, mediaCont = 0;

        while (limite < 100) {
            System.out.println("Digite o valor: ");
            num = entrada.nextInt();
            if (num != -1) {
                vetor[limite] = num;
                limite++;
            } else {
                System.out.println("Valor não aceito");
            }
        }

        for(int i = 0;i<vetor.length;i++){
            soma = soma + vetor[i];
        }
        media = soma/vetor.length;

        for(int i = 0;i<vetor.length;i++){
            if(vetor[i] > media){
                mediaCont++;
            }
        }

        System.out.println("===============");
        System.out.println("\nQuantidade de valores lidos: "+limite);
        
        System.out.println("\nOrdem que os valores foram informados: ");
        for(int i = 0;i<vetor.length;i++){
            System.out.print("[" + vetor[i] + "]");
        }

        System.out.println("\nOrdem inversa dos valores: ");
        for(int i=99; i>=0; i--){
        System.out.println(vetor[i]);
        }

        System.out.println("\nSoma dos valores: " + soma);
        System.out.println("\nMedia dos valores: " + media);
        System.out.println("\nQuantidade de valores acima da média: " + mediaCont);
    }
}
