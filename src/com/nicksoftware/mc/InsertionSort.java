package com.nicksoftware.mc;

public class InsertionSort {

    public void sort(int[] array) {
        for (var x = 1; x < array.length; x++) {
            var current = array[x];
            var j = x - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}