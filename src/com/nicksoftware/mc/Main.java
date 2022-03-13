package com.nicksoftware.mc;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] numbers = { 13, 4, 2, 15, 6, 1, 4 };

        var sorter = new InsertionSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}
