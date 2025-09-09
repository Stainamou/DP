package strategy;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] smallArray = random.ints(30, 0, 1000).toArray();
        int[] largeArray = random.ints(100_000, 0, 1_000_000).toArray();

        Sorter[] sorters = {
                new Sorter(new BubbleSort()),
                new Sorter(new MergeSort()),
                new Sorter(new QuickSort())
        };
        String[] names = {"BubbleSort", "MergeSort", "QuickSort"};

        for (int i = 0; i < sorters.length; i++) {
            int[] smallCopy = Arrays.copyOf(smallArray, smallArray.length);
            int[] largeCopy = Arrays.copyOf(largeArray, largeArray.length);

            long start = System.nanoTime();
            sorters[i].sort(smallCopy);
            long end = System.nanoTime();
            System.out.println(names[i] + " small: " + (end - start) / 1_000_000 + " ms");

            start = System.nanoTime();
            sorters[i].sort(largeCopy);
            end = System.nanoTime();
            System.out.println(names[i] + " large: " + (end - start) / 1_000_000 + " ms");
        }
    }
}
