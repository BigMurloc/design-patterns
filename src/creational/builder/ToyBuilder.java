package creational.builder;

public class ToyBuilder implements Builder {

    private ToyType type;
    private ToySize size;
    private RestrictedAge restrictedAge;


    @Override
    public void setType(ToyType type) {
        this.type = type;
    }

    @Override
    public void setSize(ToySize size) {
        this.size = size;
    }

    @Override
    public void restrictedAge(RestrictedAge restrictedAge) {
        this.restrictedAge = restrictedAge;
    }

    public Toy build() {
        return new Toy(type, size, restrictedAge);
    }
}
