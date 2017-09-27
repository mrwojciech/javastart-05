package ZadanieD08;

import java.util.Scanner;

public class Table {

    int[][] tab = new int[3][3];


    public int returnRowOfMaxSumOfElements() {
        int j = 0;
        int sum = 0;
        int sumTmp = 0;
        int row = 0;

        for (int i = 0; i < 3; i++) {
            sumTmp = returnSumOfRow(i);
            if (sumTmp > sum) {
                row = i;
                sumTmp = sum;
            }
        }
        return row;
    }


    public void enterData() {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Podaj liczbę: [" + i + ", " + j + "]");
                tab[i][j] = scanner.nextInt();
            }
        }
    }

    public int returnSumOfRow(int i) {

        int sum = 0;
        System.out.println("Sum of row:");
        for (int j = 0; j < 3; j++) {
            sum += tab[i][j];
            System.out.println(tab[i][j]);
        }
        return sum;
    }

}
