class AlatMusik {
    void bunyi() {
        System.out.println("Alat musik membuat bunyi");
    }

    void bunyi(String nada) {
        System.out.println("Alat musik membuat bunyi " + nada);
    }
}

// Kelas turunan atau subclass
class Piano extends AlatMusik {
    @Override
    void bunyi() {
        System.out.println("Piano membuat bunyi melodis");
    }

    @Override
    void bunyi(String nada) {
        System.out.println("Piano membuat bunyi " + nada);
    }
}

public class Main {
    public static void main(String[] args) {
        AlatMusik alatMusik = new AlatMusik();
        alatMusik.bunyi();
        alatMusik.bunyi("Do");

        Piano piano = new Piano();
        piano.bunyi();
        piano.bunyi("Mi");
    }
}