package creational.singleton;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ThreadUnsafeSingletonTest {

    @Test
    public void shouldBeSingleInstanceInOneThreadEnvironment() {
        var instance1 = ThreadUnsafeSingleton.getInstance();
        var instance2 = ThreadUnsafeSingleton.getInstance();

        assert instance2 == instance1;
    }

    //might require multiple runs to success, race conditions are nasty
    @Test
    public void shouldBePossibleToInstantiateMultipleInstancesInMultithreadingEnvironment() throws InterruptedException {
        int threadsAmount = 500;
        Set<ThreadUnsafeSingleton> singletonSet = Collections.newSetFromMap(new ConcurrentHashMap<>());

        ExecutorService executorService = Executors.newFixedThreadPool(threadsAmount);

        for (int i = 0; i < threadsAmount; i++) {
            executorService.execute(() -> {
                ThreadUnsafeSingleton singleton = ThreadUnsafeSingleton.getInstance();
                singletonSet.add(singleton);
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        assert singletonSet.size() > 1;
    }

}