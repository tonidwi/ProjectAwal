import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        double harga;
        int jumlah;

        System.out.print("masukan nama barang: ");
        nama = sc.nextLine();
        System.out.print("masukan harga barang: ");
        harga = sc.nextDouble();
        System.out.print("masukan jumlah barang: ");
        jumlah = sc.nextInt();

        double total = harga * jumlah;

        System.out.println("total bayar anda adalah Rp" + total);

        sc.close();

    }
    
}