package iterator;

import java.util.Iterator;

public class FibonacciSequence implements SequenceInterface {
    private final int maxCount;

    public FibonacciSequence(int maxCount) {
        this.maxCount = maxCount;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(maxCount);
    }
}
