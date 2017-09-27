package ZadanieD05;

public class Zadanie05 {


    public static void main(String[] args) {

int sum =0;

        for (int i = 0; i < 100; i++) {

            if (i % 2 == 0) {
                System.out.print(i + ", ");
                sum+=i;
            }
        }
        System.out.println();
        System.out.println("suma liczb parzystych 0 - 100 to: "+sum);
    }
}
