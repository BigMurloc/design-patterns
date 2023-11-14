package singleton;

/**
 * This implementation is thread unsafe. <p></p>
 * TODO explain why with details <p></p>
 * When calling getInstance() by multiple threads the INSTANCE variable might be null to X amount of them thus creating multiple new objects
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
