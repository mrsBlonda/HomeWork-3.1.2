import java.util.concurrent.Callable;


public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() {
        int min = 1;
        int max = 6;
        int count = 0;
        for (int i = min; i < max; i++, count++) {
            System.out.println(Thread.currentThread().getName() + " Строка - " + i);

        }
        return count;
    }
}