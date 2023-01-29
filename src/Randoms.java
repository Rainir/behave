import java.util.*;
import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    int num;
    int min, max;
    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                num = random.ints(min, max + 1).iterator().next();
                return num;
            }
        };
    }
}