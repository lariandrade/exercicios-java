import java.util.InputMismatchException;
import java.util.Scanner;

public class ex01 {

    public static char verificaOperador(char op) throws Exception {
        if (op != '+' && op != '-' && op != '/' && op != '*') {
            throw new Exception("Operador inválido!");
        } else {
            return op;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, operacao = 0;
        char operador;

        try {
            System.out.print("Digite um número: ");
            n1 = entrada.nextInt();

            System.out.print("Operação: ");
            operador = entrada.next().charAt(0);

            System.out.print("Digite um número: ");
            n2 = entrada.nextInt();

            operador = verificaOperador(operador);

            if (operador == '+') {
                operacao = n1 + n2;
            } else if (operador == '-') {
                operacao = n1 - n2;
            } else if (operador == '*') {
                operacao = n1 * n2;
            } else if (operador == '/') {
                operacao = n1 / n2;
            }

            System.out.println("Resultado: " + operacao);
        } catch (InputMismatchException e) {
            System.out.println("Número inválido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}