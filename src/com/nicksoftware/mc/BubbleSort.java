package com.nicksoftware.mc;

/**
 * Bubble sort algorithm
 * Complexity : 0(n^2)
 */
public class BubbleSort extends Sortable {

    @Override
    public void sort(int[] array) {
        boolean isSorted = false;
        for (var x = 0; x < array.length; x++) {
            isSorted = true;
            for (var y = 1; y < array.length; y++)
                if (array[y] < array[y - 1]) {
                    swap(array, y, y - 1);
                    isSorted = false;
                }
            if (isSorted)
                return;
        }

    }
}
