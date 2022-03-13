package com.nicksoftware.mc;

public class BubbleSort {
    public void sort(int[] array) {
        boolean isSorted = false;
        for (var x = 0; x < array.length; x++) {
            isSorted = true;
            for (var y = 1; y < array.length - 1; y++)
                if (array[y] < array[y - 1]) {
                    swap(array, y, y - 1);
                    isSorted = false;
                }
            if (isSorted)
                return;
        }

    }

    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
