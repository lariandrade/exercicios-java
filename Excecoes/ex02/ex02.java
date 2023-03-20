import java.util.Scanner;

public class ex02 {

    static void imprimePosicao(int m[][], int li, int co) {

        int indice = 0;

        try {
            for (int l = 0; l < m.length; l++) {
                for (int c = 0; c < m[l].length; c++) {
                    if (m[l][c] == m[li][co]) {
                        indice = m[l][c];
                    }
                }
            }
            System.out.print("Valor na posição " + "[" + li + "]" + "[" + co + "]: " + indice);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Índice informado não é válido!");
        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int linha, coluna;

        System.out.print("Digite o número da linha: ");
        linha = entrada.nextInt();

        System.out.print("Digite o número da coluna: ");
        coluna = entrada.nextInt();

        imprimePosicao(matriz, linha, coluna);
    }
}
