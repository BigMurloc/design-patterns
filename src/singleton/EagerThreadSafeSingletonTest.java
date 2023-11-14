package singleton;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class EagerThreadSafeSingletonTest {

    @Test
    public void shouldBeSingleInstanceInOneThreadEnvironment() {
        var instance1 = EagerThreadSafeSingleton.getInstance();
        var instance2 = EagerThreadSafeSingleton.getInstance();

        assert instance2 == instance1;
    }

    @Test
    public void shouldBePossibleToInstantiateMultipleInstancesInMultithreadingEnvironment() throws InterruptedException {
        int threadsAmount = 500;
        Set<EagerThreadSafeSingleton> singletonSet = Collections.newSetFromMap(new ConcurrentHashMap<>());

        ExecutorService executorService = Executors.newFixedThreadPool(threadsAmount);

        for (int i = 0; i < threadsAmount; i++) {
            executorService.execute(() -> {
                EagerThreadSafeSingleton singleton = EagerThreadSafeSingleton.getInstance();
                singletonSet.add(singleton);
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        assert singletonSet.size() == 1;
    }


}