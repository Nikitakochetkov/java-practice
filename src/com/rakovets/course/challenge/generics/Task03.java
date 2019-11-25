package com.rakovets.course.challenge.generics;

public class Task03 {
    public static void main(String[] args) {
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        average(numbers);
    }

    public static <T extends Number> void average(T[] items) {
        Integer average = 0;
        for (T item : items) {
            average += (int) item;
        }
        average /= items.length;
        System.out.println("The avarage num is : " + average);
    }
}
