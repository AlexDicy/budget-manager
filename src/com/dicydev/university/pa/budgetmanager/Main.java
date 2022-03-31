package com.dicydev.university.pa.budgetmanager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Integer[] n = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //set0(n, 10d);

        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(1));
        numbers.add(Double.valueOf(2));
        add(numbers, 3f);

        for (Number number : numbers) {
            if (number instanceof Integer) {
                System.out.println("Integer");
            } else if (number instanceof Double) {
                System.out.println("Double");
            } else if (number instanceof Float) {
                System.out.println("Float");
            } else {
                throw new IllegalStateException("Unexpected value: " + number);
            }
        }
    }

    private static void set0(Number[] n, Number newValue) {
        n[0] = newValue;
    }

    private static void add(List<Number> n, Number newValue) {
        n.add(newValue);
    }
}
