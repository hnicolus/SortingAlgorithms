package com.nicksoftware.mc;

public abstract class Sortable {
    public abstract void sort(int[] array);

    protected void swap(int[] array, int index1, int index2) {
        if (index1 == index2)
            return;
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
