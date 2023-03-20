import java.util.InputMismatchException;
import java.util.Scanner;

public class ex04 {

    static double opcaoSacar(double sal, double val) {

        sal = sal - val;

        return sal;

    }

    static double opcaoDepositar(double sal, double dep) {

        sal = sal + dep;

        return sal;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double saldo = 1000, valorSaque = 0, valorDeposito = 0;
        int op = 0;

        do {
            System.out.println("");
            System.out.println(" ==== Escolha uma das opções:  ==== ");
            System.out.println("");
            System.out.println("1. Sacar");
            System.out.println("");
            System.out.println("2. Depositar");
            System.out.println("");
            System.out.println("3. Verificar saldo");
            System.out.println("");
            System.out.println("4. Sair");
            System.out.println("=======================");
            System.out.println("");

            try {
                System.out.print("Digite a opção: ");
                op = entrada.nextInt();

                if (op == 1) {

                    System.out.println("");
                    System.out.print("Valor do saque: ");
                    valorSaque = entrada.nextDouble();

                    if (valorSaque <= saldo) {
                        opcaoSacar(saldo, valorSaque);
                        saldo = opcaoSacar(saldo, valorSaque);

                        System.out.print("Saldo disponivel: " + saldo);
                        System.out.println("");
                    } else {
                        System.out.println("");
                        System.out.println("Valor maior que saldo da conta.");
                    }
                }

                else if (op == 2) {

                    System.out.println("");
                    System.out.print("Valor do deposito: ");
                    valorDeposito = entrada.nextDouble();

                    opcaoDepositar(saldo, valorDeposito);
                    saldo = opcaoDepositar(saldo, valorDeposito);

                    System.out.print("Saldo disponivel: " + saldo);
                    System.out.println("");

                }

                else if (op == 3) {
                    System.out.println("");
                    System.out.println("Saldo disponivel: " + saldo);

                } else {
                    System.out.println("Opção inválida");
                }

            } catch (InputMismatchException e) {
                System.out.println("Somente números.");
                op = 4;
            }
        } while (op != 4);

    }
}
