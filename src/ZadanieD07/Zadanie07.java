package ZadanieD07;

import java.util.Scanner;

public class Zadanie07 {
    public static void main(String[] args) {

        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię dla pięciu osób: ");
        for (int i = 0; i < 5; i++) {

            System.out.println("Podaj imię:");
            names[i] = scanner.nextLine();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println("Cześć, " + names[i]);
        }

    }

}
