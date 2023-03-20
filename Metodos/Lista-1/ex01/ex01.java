/*
1. Faça um programa que leia um valor inteiro e que tenha um método que
verifique e mostre se o número é par, ímpar ou nulo (igual a zero). Método
sem retorno.
 
 */
import java.util.Scanner;
public class ex01 {

    public static void verificar(int val) {
        
        if(val == 0){
            System.out.println("Valor é nulo!");
        } else if(val % 2 == 0){
            System.out.println("Valor é par!");
        } else {
            System.out.println("Valor é impar!");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Digite um valor: ");
        num = entrada.nextInt();

        verificar(num);
    }
}