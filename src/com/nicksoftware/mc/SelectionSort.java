package com.nicksoftware.mc;

public class SelectionSort extends Sortable {

    @Override
    public void sort(int[] array) {
        for (var x = 0; x < array.length; x++) {
            var minIndex = x;
            for (var y = x; y < array.length; y++)
                if (array[minIndex] > array[y])
                    minIndex = y;
            swap(array, minIndex, x);
        }
    }
}
