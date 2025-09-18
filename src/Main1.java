class Hewan {
    void suara() {
        System.out.println("suara hewan: ");
    }

}

class Kucing extends Hewan {
    void suara() {
        System.out.println("meong");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        Hewan n = new Kucing();
        h.suara();
        n.suara();
    }

}