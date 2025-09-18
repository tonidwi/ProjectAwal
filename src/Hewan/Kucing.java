package Hewan;

public class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }

    void makan() {
        System.out.println(nama + "makan ikan");
    }

    void suara() {
        System.out.println("meong");
    }

}
