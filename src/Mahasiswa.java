public class Mahasiswa {

    String nama;
    String nim;
    String jurusan;

    Mahasiswa() {
        nama = "toni";
        nim = "2222222";
        jurusan = "IT";

    }

    void tampilData() {
        System.out.println(nama);
        System.out.println(nim);
        System.out.println(jurusan);
    }

    public static void main(String[] args) {
        Mahasiswa murid = new Mahasiswa();

        murid.nama = "dwi";
        murid.jurusan = "mtk";

        murid.tampilData();
    }
}