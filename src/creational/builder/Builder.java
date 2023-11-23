package creational.builder;

public interface Builder {

    void setType(ToyType type);
    void setSize(ToySize size);
    void restrictedAge(RestrictedAge restrictedAge);

}
