package main.java.com.AlexZabara.practice.modul02.task02_1;

import java.util.Arrays;

public class SumMaxMinPositiveMultiplicationModuleSecondBig {
    public static void main(String[] args) {
        SumMaxMinPositiveMultiplicationModuleSecondBig smmpmms = new SumMaxMinPositiveMultiplicationModuleSecondBig();
        int arrayMas[] = {10, 2, 3, 4, 5, 6, 7, 8, 9, 2};
        double arrayDouble[] = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        smmpmms.printSumArray(arrayMas);
        smmpmms.printMaxArray(arrayMas);
        smmpmms.printMinArray(arrayMas);
        smmpmms.printMaxPositiveArray(arrayMas);
        smmpmms.printMultiplicationArray(arrayMas);
        smmpmms.printModuleArray(arrayMas);
        smmpmms.printSecondBigArray(arrayMas);

        System.out.println("--------------------------");

        smmpmms.printSumArray(arrayDouble);
        smmpmms.printMaxArray(arrayDouble);
        smmpmms.printMinArray(arrayDouble);
        smmpmms.printMaxPositiveArray(arrayDouble);
        smmpmms.printMultiplicationArray(arrayDouble);
        smmpmms.printModuleArray(arrayDouble);
        smmpmms.printSecondBigArray(arrayDouble);
    }

    //sum
    public void printSumArray(int arrayMas[]) {
        int sum = 0;
        for (int i = 0; i < arrayMas.length; i++) {
            sum += arrayMas[i];
        }
        System.out.println("Sum int = " + sum);
    }

    public void printSumArray(double arrayDouble[]) {
        int sum = 0;
        for (int i = 0; i < arrayDouble.length; i++) {
            sum += arrayDouble[i];
        }
        System.out.println("Sum double = " + sum);
    }

    //printMaxArray and printMinArray
    public void printMaxArray(int arrayMas[]) {
        int max = Arrays.stream(arrayMas).max().getAsInt();
        System.out.println("Max int = " + max);
    }

    public void printMaxArray(double arrayDouble[]) {
        double max = Arrays.stream(arrayDouble).max().getAsDouble();
        System.out.println("Max double = " + max);
    }

    public void printMinArray(int arrayMas[]) {
        int min = Arrays.stream(arrayMas).min().getAsInt();
        System.out.println("Min = " + min);
    }

    public void printMinArray(double arrayDouble[]) {
        double min = Arrays.stream(arrayDouble).min().getAsDouble();
        System.out.println("Min double = " + min);
    }

    //Max printMaxPositiveArray
    public void printMaxPositiveArray(int arrayMas[]) {
        int maxPositive = 0;
        for (int number : arrayMas) {
            if (number > maxPositive) {
                maxPositive = number;
            }
        }
        if (maxPositive > 0) {
            System.out.println("positive int = " + maxPositive);
        } else System.out.println("Положительного нет");
    }

    public void printMaxPositiveArray(double arrayDouble[]) {
        double maxPositive = 0;
        for (double number : arrayDouble) {
            if (number > maxPositive) {
                maxPositive = number;
            }
        }
        if (maxPositive > 0) {
            System.out.println("positive double = " + maxPositive);
        } else System.out.println("Положительного нет");
    }

    //printMultiplicationArray
    public void printMultiplicationArray(int arrayMas[]) {
        int multiplication = 1;
        for (int number : arrayMas) {
            multiplication *= number;
        }
        System.out.println("Умнож int = " + multiplication);
    }

    public void printMultiplicationArray(double arrayDouble[]) {
        int multiplication = 1;
        for (double number : arrayDouble) {
            multiplication *= number;
        }
        System.out.println("Умнож = double " + multiplication);
    }

    //Module
    public void printModuleArray(int arrayMas[]) {
        int first = arrayMas[0];
        int last = arrayMas[9];
        System.out.println("Module first int = " + Math.abs(first) + "\n" + "Module last int = " + Math.abs(last));
    }

    public void printModuleArray(double arrayDouble[]) {
        double first = arrayDouble[0];
        double last = arrayDouble[9];
        System.out.println("Module first double = " + Math.abs(first) + "\n" + "Module last double = " + Math.abs(last));
    }

    //SecondBig
    public void printSecondBigArray(int arrayMas[]) {
        int big = arrayMas[0];
        int secondBig = arrayMas[0];
        for (int number : arrayMas)
            if (number > big) {
                secondBig = big;
                big = number;
            } else if (number > secondBig)
                secondBig = number;
        System.out.println("Second Big int = " + secondBig);
    }

    public void printSecondBigArray(double arrayDouble[]) {
        double big = arrayDouble[0];
        double secondBig = arrayDouble[0];
        for (double number : arrayDouble)
            if (number > big) {
                secondBig = big;
                big = number;
            } else if (number > secondBig)
                secondBig = number;
        System.out.println("Second Big double = " + secondBig);
    }
}