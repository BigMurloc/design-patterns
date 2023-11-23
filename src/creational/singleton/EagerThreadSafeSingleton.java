package creational.singleton;

/**
 * This implementation achieves thread safety by eagerly loading the instance thus making instance read-only for multiple threads
 * <p></p>
 * This is an easy way to achieve thread safety in creational.singleton,
 * but it comes with a very big con which is initializing potentially very resource heavy object for no reason
 */
class EagerThreadSafeSingleton {
    private static final EagerThreadSafeSingleton INSTANCE = new EagerThreadSafeSingleton();

    private EagerThreadSafeSingleton() {}

    public static EagerThreadSafeSingleton getInstance() {
        return INSTANCE;
    }
}
