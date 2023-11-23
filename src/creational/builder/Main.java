package creational.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        ToyBuilder carBuilder = new ToyBuilder();
        ToyBuilder dollBuilder = new ToyBuilder();
        ToyBuilder legoBuilder = new ToyBuilder();

        director.constructBigCar(carBuilder);
        director.constructBarbie(dollBuilder);
        director.constructHarryPotterLegoSet(legoBuilder);

        System.out.println(carBuilder.build().toString());
        System.out.println(dollBuilder.build().toString());
        System.out.println(legoBuilder.build().toString());
    }
}
