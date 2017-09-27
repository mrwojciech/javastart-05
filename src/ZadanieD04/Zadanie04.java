package ZadanieD04;

import java.util.Scanner;

public class Zadanie04 {


    public static void main(String[] args) {

        Punkt punkt;// = new Punkt();
        Scanner scanner = new Scanner(System.in);
        double x, y;

        System.out.println("Podaj współrzędne punktu:");
        System.out.print("x:");
        x = scanner.nextDouble();
        System.out.print("y:");
        y = scanner.nextDouble();
        punkt = new Punkt(x, y);
        int part = punkt.whichPartOfChart();
        if (part != -1) {
            System.out.println("Punkt: (" + x+", " +y+ ")" + "znajduje się w ćwiartce: " + part);

        }

    }
}
