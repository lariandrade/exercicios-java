package ex04;

/*
Elabore um programa que preencha uma matriz 3 x 6, calcule e mostre:
• O maior elemento da matriz e sua respectiva posição;
• O menor elemento da matriz e sua respectiva posição.
*/
public class ex04 {
    public static void main(String[] args) {
        int m[][] = { { 2, 2, 1, 5, 6, 7 }, { 8, 6, 4, 6, 2, 9 }, { 3, 5, 6, 7, 4, 2 } };
        int maior = 0, lMaior = 0, cMaior = 0, menor = 90000, lMenor = 0, cMenor = 0;

        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                if (m[l][c] > maior) {
                    maior = m[l][c];
                    lMaior = l+1;
                    cMaior = c+1;
                } else if(m[l][c] < menor){
                    menor = m[l][c];
                    lMenor = l+1;
                    cMenor = c+1;
                }
            }
        }
        System.out.println("Valores da matriz: ");
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                System.out.print(m[l][c] + " ");
            }
            System.out.println("");
        }

        System.out.println(" ");
        System.out.println("Maior elemento da matriz: ");
        System.out.println(" ");
        System.out.println("Valor: " + maior);
        System.out.println("Localizado na linha: " + lMaior);
        System.out.println("Na coluna: " + cMaior);

        System.out.println(" ");
        System.out.println("Menor elemento da matriz: ");
        System.out.println(" ");
        System.out.println("Valor: " + menor);
        System.out.println("Localizado na linha: " + lMenor);
        System.out.println("Na coluna: " + cMenor);

    }
}
