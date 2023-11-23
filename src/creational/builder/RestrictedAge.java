package creational.builder;

public class RestrictedAge {
    private int age;

    public RestrictedAge(int age) {
        if (age < 3) {
            throw new IllegalArgumentException("Minimum allowed age for playing toys is 3");
        }
        if (age > 18) {
            throw new IllegalArgumentException("Maximum allowed age for playing toys is 18");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return String.valueOf(age);
    }
}
