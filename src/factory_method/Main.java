package factory_method;

public class Main {
    public static void main(String[] args) {
        Toy toy = resolveToy(args[0]);
        toy.playSound();
    }

    static Toy resolveToy(String toy) {
        if (toy == null) {
            throw new IllegalArgumentException("Toy cannot be null");
        }

        if (toy.equalsIgnoreCase("cat")) {
            return new CatToy();
        }
        if (toy.equalsIgnoreCase("dog")) {
            return new DogToy();
        }

        throw new RuntimeException("No matching toy found for : " + toy);
    }

}
