package creational.builder;

public class Director {

    public void constructBarbie(Builder builder) {
        builder.restrictedAge(new RestrictedAge(3));
        builder.setSize(ToySize.S);
        builder.setType(ToyType.DOLL);
    }

    public void constructHarryPotterLegoSet(Builder builder) {
        builder.setType(ToyType.LEGO);
        builder.setSize(ToySize.L);
        builder.restrictedAge(new RestrictedAge(12));
    }

    public void constructBigCar(Builder builder) {
        builder.setType(ToyType.CAR);
        builder.setSize(ToySize.L);
        builder.restrictedAge(new RestrictedAge(3));
    }

}
