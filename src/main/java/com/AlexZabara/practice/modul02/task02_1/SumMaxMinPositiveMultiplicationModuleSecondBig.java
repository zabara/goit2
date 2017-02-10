package main.java.com.AlexZabara.practice.modul02.task02_1;

import java.util.Arrays;

public class SumMaxMinPositiveMultiplicationModuleSecondBig {
    public static void main(String[] args) {
        SumMaxMinPositiveMultiplicationModuleSecondBig smmpmms = new SumMaxMinPositiveMultiplicationModuleSecondBig();
        int arrayMas[] = {10, 2, 3, 4, 5, 6, 7, 8, 9, 2};
        smmpmms.sum(arrayMas);
        smmpmms.max(arrayMas);
        smmpmms.min(arrayMas);
        smmpmms.positive(arrayMas);
        smmpmms.multiplication(arrayMas);
        smmpmms.module(arrayMas);
        smmpmms.secondBig(arrayMas);
    }

    //sum
    public void sum(int arrayMas[]) {
        int sum = 0;
        for (int i = 0; i < arrayMas.length; i++) {
            sum += arrayMas[i];
        }
        System.out.println("Sum = " + sum);
    }

    //max and min
    public void max(int arrayMas[]) {
        int max = Arrays.stream(arrayMas).max().getAsInt();
        System.out.println("Max = " + max);
    }

    public void min(int arrayMas[]) {
        int min = Arrays.stream(arrayMas).min().getAsInt();
        System.out.println("Min = " + min);
    }

    //Max positive
    public void positive(int arrayMas[]) {
        int maxPositive = 1;
        for (int number : arrayMas) {
            if (number > 0 && maxPositive < number) {
                maxPositive = number;
            }
        }
        System.out.println("maxPositive = " + maxPositive);
    }

    //multiplication
    public void multiplication(int arrayMas[]) {
        int multiplication = 1;
        for (int number : arrayMas) {
            multiplication *= number;
        }
        System.out.println("Умнож = " + multiplication);
    }

    //Module
    public void module(int arrayMas[]) {
        int first = arrayMas[0];
        int last = arrayMas[9];
        System.out.println("Module first = " + Math.abs(first) + "\n" + "Module last = " + Math.abs(last));
    }

    //SecondBig
    public void secondBig(int arrayMas[]) {
        int big = arrayMas[0];
        int secondBig = arrayMas[0];
        for (int number : arrayMas)
            if (number > big) {
                secondBig = big;
                big = number;
            } else if (number > secondBig)
                secondBig = number;
        System.out.println("Second Big = " + secondBig);
    }
}