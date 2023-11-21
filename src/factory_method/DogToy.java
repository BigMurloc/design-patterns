package factory_method;

public class DogToy implements Toy {
    @Override
    public SoundModule createSoundModule() {
        return new DogModule();
    }
}
