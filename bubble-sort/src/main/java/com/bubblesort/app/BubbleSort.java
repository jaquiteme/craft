package com.bubblesort.app;

// Bubble Sort use cases: 
// - Can be used when complexity no matter 
// - Or When short code is prefered
public class BubbleSort {

    public int[] sortAsc(int[] values) {
        boolean sorted = false;

        while (!sorted) {
            for (int i = 0; i < (values.length - 1); i++) {
                sorted = true;
                System.out.println("i: " + i);
                for (int j = 0; j < (values.length - i - 1); j++) {
                    System.out.println("j: " + j);
                    if (values[j] > values[j + 1]) {
                        int tmp = values[j];
                        values[j] = values[j + 1];
                        values[j + 1] = tmp;
                        sorted = false;
                    }
                }
                if (sorted)
                    break;
            }
        }
        return values;
    }
}
