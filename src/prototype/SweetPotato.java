package prototype;

/**
 * Encapsulation omitted for readability purposes
 */
public class SweetPotato extends Potato {
    int price;
    public SweetPotato(int calories, int price) {
        super(calories);
    }

    public SweetPotato(SweetPotato sweetPotato) {
        super(sweetPotato);
        this.price = sweetPotato.price;
    }

    @Override
    public Prototype prototype() {
        return new SweetPotato(this);
    }
}
