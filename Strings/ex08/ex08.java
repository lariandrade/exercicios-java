package ex08;

import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "latin1");

        String disciplina, palavra;
        palavra = "Programacao";

        System.out.print("Digite a Disciplina: ");
        disciplina = entrada.nextLine();
        System.out.println("Disciplina: " + disciplina);

        if (disciplina.equalsIgnoreCase(palavra)) {
            System.out.println("Faz parte Categoria de Programacao!");
        } else {
            System.out.println("Nao faz parte da Categoria de Programacao!");
        }
    }
}
