package builder;

public class Toy {
    private ToyType type;
    private ToySize size;
    private RestrictedAge restrictedAge;

    public Toy(ToyType type, ToySize size, RestrictedAge restrictedAge) {
        this.type = type;
        this.size = size;
        this.restrictedAge = restrictedAge;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "type=" + type +
                ", size=" + size +
                ", age=" + restrictedAge +
                '}';
    }
}
