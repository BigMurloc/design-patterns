package creational.factory_method;

public class CatToy implements Toy {
    @Override
    public SoundModule createSoundModule() {
        return new CatModule();
    }
}
