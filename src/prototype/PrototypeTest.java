package prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @Test
    public void cloneObjectShouldHaveDifferentReferencesWhileHavingTheSameFieldsValues() {
        var potato = new Potato(150);
        var clonedPotato = (Potato) potato.prototype();

        Assertions.assertNotEquals(potato, clonedPotato);
        Assertions.assertEquals(potato.calories, clonedPotato.calories);
    }

    @Test
    public void clonedSubclassShouldHaveDifferentReferencesWhileHavingTheSameFieldsValues() {
        var potato = new SweetPotato(150, 300);
        var clonedPotato = (SweetPotato) potato.prototype();

        Assertions.assertNotEquals(potato, clonedPotato);
        Assertions.assertEquals(potato.calories, clonedPotato.calories);
        Assertions.assertEquals(potato.price, clonedPotato.price);
    }

}
