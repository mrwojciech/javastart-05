package ZadanieD03;

public class Zadanie03 {

    public static void main(String[] args) {

        for (double i = 0; i < 3.1; i += 0.1) {
            System.out.printf("%.1f, ", i);
        }
        System.out.println();
        double i = 0;
        while (i < 3.01) {

            System.out.printf("%.1f, ", i);

            i += 0.1;
        }
        i=0;

        System.out.println();
        do {
            System.out.printf("%.1f, ", i);
            i += 0.1;

        } while (i < 3.1);

    }

}
