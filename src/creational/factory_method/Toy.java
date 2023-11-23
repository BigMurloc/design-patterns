package creational.factory_method;

public interface Toy {
    default void playSound() {
        SoundModule soundModule = createSoundModule();
        soundModule.play();
    }

    SoundModule createSoundModule();

}
