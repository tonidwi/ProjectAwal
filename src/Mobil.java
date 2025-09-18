public class Mobil {
    // atribut
    String merk;
    int tahun;

    // method inffo mobil

    void infoMobil() {
        System.out.println("merk mobil " + merk);
        System.out.println("tahun mobil " + tahun);
    }

    public static void main(String[] args) {
        Mobil a = new Mobil();
        // initial
        a.merk = "toyota";
        a.tahun = 2002;
        // memanggil method info mobil
        a.infoMobil();
    }
}
