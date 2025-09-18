package Hewan;

public class Anjing extends Hewan {

    Anjing(String nama) {
        super(nama);
    }

    void makan() {
        System.out.println(nama + "sedang makan tulang");
    }

    void suara() {
        System.out.println("bufff buf");
    }

}
