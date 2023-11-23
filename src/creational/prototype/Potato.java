package creational.prototype;
/**
 * Encapsulation omitted for readability purposes
 */
public class Potato implements Vegetable {
    int calories;

    public Potato(int calories) {
        this.calories = calories;
    }

    public Potato(Potato potato) {
        this.calories = potato.calories;
    }

    //renamed because of Object.clone()
    @Override
    public Prototype prototype() {
        return new Potato(this);
    }
}
