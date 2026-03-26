abstract class Character {
    String name;

    Character(String name) {
        this.name = name;
    }

    abstract void attack();
}

class Warrior extends Character {
    Warrior(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " attacks with sword");
    }
}

class Archer extends Character {
    Archer(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " attacks with an arrow");
    }
}

class Mage extends Character {
    Mage(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " attacks with magic");
    }
}

public class Game {
    public static void main(String[] args) {
        Character[] heroes = {
            new Warrior("Thorin"),
            new Archer("Robin"),
            new Mage("Merlin")
        };

        for (Character hero : heroes) {
            hero.attack();
        }
    }
}
