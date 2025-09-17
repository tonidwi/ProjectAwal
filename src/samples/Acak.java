package samples;
import java.util.Random;
import java.util.Scanner;

public class Acak {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner input = new Scanner(System.in);

        int acak = ran.nextInt(10);
        int angka;

        while (angka == acak) {

            System.out.println("masukan angka random: ");
            int angka = input.nextInt();

            if (angka == acak) {
                System.out.println("jawaban anda benar");

            } else {
                System.out.println("jawaban anda salah");

            }
        }
    }
}
