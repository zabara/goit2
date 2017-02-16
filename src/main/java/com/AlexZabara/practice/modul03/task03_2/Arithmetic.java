package main.java.com.AlexZabara.practice.modul03.task03_2;

/**
 * Created by alex on 16.02.2017.
 */
public class Arithmetic {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.add(11, 10);
        Adder adder = new Adder();
        adder.chek(9, 10);
    }

    public void add(int a, int b){
       int printSum =  a + b;
        System.out.println(printSum);
    }
}
