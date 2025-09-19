package Hewan;

public class Main {
    public static void main(String[] args) {
        Hewan h = new Hewan("hewan umum");
        h.makan();

        Kucing k = new Kucing("kitty");
        k.makan();
        k.suara();
        k.makan();

        Anjing a = new Anjing("julia");
        a.makan();
        a.suara();
        a.makan();
    }
}
