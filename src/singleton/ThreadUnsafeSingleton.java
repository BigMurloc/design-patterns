package singleton;

/**
 * This implementation is thread unsafe. <p></p>
 * When calling getInstance() by multiple threads the INSTANCE variable might be null to X amount of them thus creating multiple new objects
 * <p></p>
 * This is because of the memory visibility,
 * by default the writes to variables are not immediately flushed so other threads can see them
 */
class ThreadUnsafeSingleton {

    private static ThreadUnsafeSingleton INSTANCE = null;

    private ThreadUnsafeSingleton() {}

    public static ThreadUnsafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadUnsafeSingleton();
        }

        return INSTANCE;
    }

}
