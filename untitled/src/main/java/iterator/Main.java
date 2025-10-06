package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int numberOfFibonacciNumbers = 10;
        SequenceInterface sequence = new FibonacciSequence(numberOfFibonacciNumbers);
        Iterator<Integer> iterator = sequence.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
