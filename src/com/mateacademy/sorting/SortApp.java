package com.mateacademy.sorting;

public class SortApp {
    public static void main(String[] args) {

        int[] numbers = {3, 6, 1, 7, 2, 8, 10, 4, 9, 5};
        SortUtil.print(SortUtil.selectionSort(numbers));

        int[] numbers2 = {3, 6, 1, 7, 2, 8, 10, 4, 9, 5};
        SortUtil.print(SortUtil.insertionSort(numbers2));

        int[] numbers3 = {3, 6, 1, 7, 2, 8, 10, 4, 9, 5};
        SortUtil.print(SortUtil.heapSort(numbers3));

        int[] numbers4 = {3, 6, 1, 7, 2, 8, 10, 4, 9, 5};
        SortUtil.print(SortUtil.shellSort(numbers4));

        int[] numbers5 = {3, 6, 1, 7, 2, 8, 10, 4, 9, 5};
        SortUtil.print(SortUtil.bucketSort(numbers5));

        long before = System.currentTimeMillis();
        SortUtil.bucketSort(SortUtil.getRandomInts());
        long after = System.currentTimeMillis();
        System.out.println("BucketSort: " + (after - before) + " ms.");

        before = System.currentTimeMillis();
        SortUtil.selectionSort(SortUtil.getRandomInts());
        after = System.currentTimeMillis();
        System.out.println("SelectionSort: " + (after - before) + " ms.");

        before = System.currentTimeMillis();
        SortUtil.insertionSort(SortUtil.getRandomInts());
        after = System.currentTimeMillis();
        System.out.println("InsertionSort: " + (after - before) + " ms.");

        before = System.currentTimeMillis();
        SortUtil.heapSort(SortUtil.getRandomInts());
        after = System.currentTimeMillis();
        System.out.println("HeapSort: " + (after - before) + " ms.");

        before = System.currentTimeMillis();
        SortUtil.shellSort(SortUtil.getRandomInts());
        after = System.currentTimeMillis();
        System.out.println("ShellSort: " + (after - before) + " ms.");
    }
}
