package Zadanied06;

import java.util.Scanner;

public class Zadanie06 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (!(((input > 100) && (input < 200)) && (input % 3 == 0))) {
            System.out.println("Podaj liczbe z przedziału 100-200 podzielna przez 3: ");
            input = scanner.nextInt();

            if (input < 100) {
                System.out.println("Twoja liczba jest za mala");
            } else if (input > 200) {
                System.out.println("Twoja liczba jest za duza");
            } else if (input % 3 != 0) {
                System.out.println("Twoja liczb nie dzieli się przez 3");
            }
        }
        System.out.println("Twoja liczba jest ok");

    }
}
