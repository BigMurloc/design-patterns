package creational.factory_method;

public class CatModule implements SoundModule {
    @Override
    public void play() {
        System.out.println("Meow!");
    }
}
