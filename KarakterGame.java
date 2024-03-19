public class KarakterGame {
    void serang() {
        System.out.println("Karakter menyerang!");
    }
}

class Monster extends KarakterGame {
    @Override
    void serang() {
        System.out.println("Monster menyerang dengan kejam!");
    }
}

class Player extends KarakterGame {
    @Override
    void serang() {
        System.out.println("Player menyerang dengan strategi.");
    }
}

public class Main {
    public static void main(String[] args) {
        KarakterGame karakter1 = new Monster();
        karakter1.serang(); // Output: "Monster menyerang dengan kejam!"

        KarakterGame karakter2 = new Player();
        karakter2.serang(); // Output: "Player menyerang dengan strategi."
    }
}
