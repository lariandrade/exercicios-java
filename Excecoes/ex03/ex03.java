import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        String str;

        try {
            System.out.print("Digite um número: ");
            str = entrada.nextLine();

            num = Integer.parseInt(str);

            System.out.println("Num: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Aceita apenas número!");
        }
    }
}
