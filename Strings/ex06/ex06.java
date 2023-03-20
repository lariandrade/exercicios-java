package ex06;

import java.io.IOException;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in, "latin1");

        String palavra;
        char letra;

        System.out.print("Digite uma frase:");
        palavra = entrada.next();

        System.out.print("Digite uma letra:");
        letra = (char) System.in.read();

        for (int i = 0; i < palavra.length(); i++) {
            if (letra == palavra.charAt(i))
                System.out.println("Letra " + letra + " está na posição: " + (i + 1));

        }
    }
}