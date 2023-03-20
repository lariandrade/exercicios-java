/*
5. Faça um programa que tenha um método que calcule a quantidade de segundos 
pertencentes a um tempo inserido pelo usuário. Esse tempo por ser composto apenas por 
hora, por hora e minuto ou por hora, minuto e segundos. O usuário irá definir qual será 
o formato a ser inserido, e dependendo do formato, serão digitadas entradas diferentes. 
Deverá ser usado métodos sobrecarregados. Exemplo: 
Escolha o formato de tempo: (1) hora (2) hora e min (3) hora, min e seg 

2 
Digite a hora: 4 
Digite o minuto: 15 
Total em segundos: 15300
*/

import java.util.Scanner;
public class ex05 {

    static int segundos(int h) {
        int resultado = 0;

        for (int i = 0; i < h; i++) {
            resultado = resultado + 3600;
        }

        return resultado;
    }

    static int segundos(int h, int m) {
        int resultado = 0, horas = 0, minutos = 0;

        for (int i = 0; i < h; i++) {
            horas = horas + 3600;
        }

        for (int i = 0; i < m; i++) {
            minutos = minutos + 60;
        }

        resultado = horas + minutos;

        return resultado;
    }

    static int segundos(int h, int m, int s) {
        int resultado = 0, horas = 0, minutos = 0;

        for (int i = 0; i < h; i++) {
            horas = horas + 3600;
        }

        for (int i = 0; i < m; i++) {
            minutos = minutos + 60;
        }

        resultado = horas + minutos + s;

        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op, hora, min, seg, res = 0;

        System.out.println("Escolha o formato de tempo: ");
        System.out.print("(1) hora (2) hora e min (3) hora, min e seg: ");
        op = entrada.nextInt();

        if (op == 1) {
            System.out.print("Digite a hora: ");
            hora = entrada.nextInt();

            segundos(hora);
            res = segundos(hora);

        } else if (op == 2) {
            System.out.print("Digite a hora: ");
            hora = entrada.nextInt();

            System.out.print("Digite o minuto: ");
            min = entrada.nextInt();

            segundos(hora, min);
            res = segundos(hora, min);

        } else if (op == 3) {
            System.out.print("Digite a hora: ");
            hora = entrada.nextInt();

            System.out.print("Digite o minuto: ");
            min = entrada.nextInt();

            System.out.print("Digite os segundos: ");
            seg = entrada.nextInt();

            segundos(hora, min, seg);
            res = segundos(hora, min, seg);
        } else {
            System.out.print("Opção Inválida.");
        }

        System.out.print("Tempo em segundos: " + res);
    }
}
