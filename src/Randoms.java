import java.util.*;
import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    List<Integer> numbs;
//    int min;
//    int max;
    public Randoms(int min, int max) {
         numbs = random.ints(5, min, max).boxed().toList();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int nextNum = 0;
            @Override
            public boolean hasNext() {
                return nextNum < numbs.size();
            }

            @Override
            public Integer next() {
                int numb;
                if (nextNum == numbs.size()) {
                    //List<Integer> numbs = random.ints(10, min, max).boxed().toList();
                    numb = numbs.get(0);
                    nextNum = 1;
                } else {
                    numb = numbs.get(nextNum);
                    nextNum++;
                }
                return numb;
            }
        };
    }
}