package samples;
import java.util.Scanner;

public class konversi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        String huruf;
        boolean ulangi = true;

        while (ulangi) {
            System.out.println("masukan angka yang ingin di konversi: ");
            angka = input.nextInt();
            input.nextLine();

            if (angka >= 80) {
                System.out.println("A");
            } else if (angka >= 70) {
                System.out.println("B");
            } else if (angka >= 60) {
                System.out.println("C");
            } else if (angka >= 50) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }

            System.out.println("keluar? y/n");
            huruf = input.nextLine();

            if (huruf.equalsIgnoreCase("y")) {
                ulangi = false;
            }

        }
        input.close();
    }
}
