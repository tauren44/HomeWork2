package com.mateacademy.sorting;

import java.util.Arrays;
import java.util.Random;

public class SortUtil {

    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void print(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int[] getRandomInts() {
        int[] array = new int[1_000_000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(40);
        }
        return array;
    }

    public static int[] insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int key = elements[i];
            int j = i - 1;
            while (j >= 0 && key < elements[j]) {
                elements[j + 1] = elements[j];
                j--;
            }
            elements[j + 1] = key;
        }
        return elements;
    }

    public static int[] shellSort(int[] numbers) {
        int j;
        for (int gap = numbers.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < numbers.length; i++) {
                int temp = numbers[i];
                for (j = i; j >= gap && numbers[j - gap] > temp; j -= gap) {
                    numbers[j] = numbers[j - gap];
                }
                numbers[j] = temp;
            }
        }
        return numbers;
    }

    public static int[] heapSort(int[] numbers) {
        for (int i = numbers.length / 2 - 1; i >= 0; i--) {
            shiftDown(numbers, i, numbers.length);
        }
        for (int i = numbers.length - 1; i > 0; i--) {
            swap(numbers, 0, i);
            shiftDown(numbers, 0, i);
        }
        return numbers;
    }

    private static void shiftDown(int[] numbers, int i, int j) {
        int child;
        int temp;

        for (temp = numbers[i]; leftChild(i) < j; i = child) {
            child = leftChild(i);
            if (child != j - 1 && (numbers[child] < numbers[child + 1])) {
                child++;
            }
            if (temp < numbers[child]) {
                numbers[i] = numbers[child];
            } else {
                break;
            }
        }
        numbers[i] = temp;
    }

    private static int leftChild(int i) {
        return 2 * i + 1;
    }

    public static int[] selectionSort(int[] numbers) {
        for (int temp = 0; temp <= numbers.length - 1; temp++) {
            swap(numbers, temp, getSmallest(numbers, temp, numbers.length - 1));
        }
        return numbers;
    }

    public static int getSmallest(int[] numbers, int min, int max) {
        int small = min;
        for (int i = min + 1; i <= max; i++) {
            if (numbers[i] < numbers[small]) {
                small = i;
            }
        }
        return small;
    }

    public static int[] bucketSort(int[] numbers) {
        int i;
        int j;
        int[] bucket = new int[maxValue(numbers) + 1];
        Arrays.fill(bucket, 0);
        for (i = 0; i < numbers.length; i++) {
            bucket[numbers[i]]++;
        }
        int k = 0;
        for (i = 0; i < bucket.length; i++) {
            for (j = 0; j < bucket[i]; j++) {
                numbers[k++] = i;
            }
        }
        return numbers;
    }

    private static int maxValue(int[] array) {
        int maxValue = 0;
        for (int item : array) {
            if (item > maxValue) {
                maxValue = item;
            }
        }
        return maxValue;
    }
}
