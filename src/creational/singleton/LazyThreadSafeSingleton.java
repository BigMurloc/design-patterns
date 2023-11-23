package creational.singleton;

/**
 * There are two issues with lazy loaded creational.singleton thread safety: <p></p>
 * 1. The creation of new instance can be achieved by multiple threads at the same time.
 * To fix this we should only allow one thread to create an instance of creational.singleton at given moment.
 * We can achieve this by synchronizing the constructor call.
 * <p></p>
 * 2. Even when we allow only one thread to create an instance of the creational.singleton
 * there is still a risk that the INSTANCE variable will still be null
 * due to not flushing the write by another thread.
 * To achieve this we should mark the instance as volatile.
 */
class LazyThreadSafeSingleton {

    private static volatile LazyThreadSafeSingleton INSTANCE = null;
    private static final Object lock = new Object();

    private LazyThreadSafeSingleton() {
    }

    public static LazyThreadSafeSingleton getInstance() {
        synchronized (lock) {
            if (INSTANCE == null) {
                INSTANCE = new LazyThreadSafeSingleton();
            }
        }

        return INSTANCE;
    }

}
