class Hewan {
    String nama;
    String suara;

    void suara() {
        System.out.println("hewan ini bersuara : " + suara);
    }
}

class Kucing extends Hewan {

    void suara() {
        System.out.println("meong");
    }
}

class Anjing extends Hewan {

    void suara() {
        System.out.println("buf buf");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan k = new Kucing();
        Hewan a = new Anjing();

        k.suara();
        a.suara();
    }
}