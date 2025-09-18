package Hewan;
//membuat kelas hewan
public class Hewan {

    //memberikan atribut 
    String nama;
//membuat kotrustor untuk isi nama
    Hewan(String nama){
        this.nama = nama;
    }
//method umum
    void makan(){
        System.out.println("sedang makan ....");
    }
}
