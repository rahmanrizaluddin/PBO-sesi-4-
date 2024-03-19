public class Karakter {
    String junaedi;

    Karakter(String junaedi) {
        this.junaedi = junaedi;
    }

    void perkenalan() {
        System.out.println("Halo, saya " + junaedi + "!");
    }
}

class Superhero extends Karakter {
    String kekuatan;

    Superhero(String junaedi, String kekuatan) {
        super(junaedi);
        this.kekuatan = kekuatan;
    }

    @Override
    void perkenalan() {
        System.out.println("Saya adalah " + junaedi + ", seorang superhero dengan kekuatan " + kekuatan + "!");
    }
}

public class Main {
    public static void main(String[] args) {
        Karakter karakter1 = new Karakter("John");
        karakter1.perkenalan(); // Output: "Halo, saya John!"

        Superhero superhero1 = new Superhero("Iron Man", "armor teknologi tinggi");
        superhero1.perkenalan(); // Output: "Saya adalah Iron Man, seorang superhero dengan kekuatan armor teknologi tinggi!"
    }
}
