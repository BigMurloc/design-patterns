package creational.factory_method;

public class DogModule implements SoundModule {
    @Override
    public void play() {
        System.out.println("Bark!");
    }
}
