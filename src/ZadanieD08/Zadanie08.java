package ZadanieD08;

import java.util.Scanner;

public class Zadanie08 {

    public static void main(String[] args) {

        int[][] tab = new int[3][3];
        Table table = new Table();
        table.enterData();
        //table.returnSumOfRow(1);

        int rowMax = table.returnRowOfMaxSumOfElements();
        int sumMax = table.returnSumOfRow(rowMax++);

        System.out.println("Największa suma liczb jest w wierszu:"+ rowMax+" wynosi: "+sumMax);
    }

}
