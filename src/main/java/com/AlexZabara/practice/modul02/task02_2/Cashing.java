package main.java.com.AlexZabara.practice.modul02.task02_2;

import java.util.Scanner;

public class Cashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double myBalance = 100;

        System.out.println("Сусса которую хотите снять... = ");
        double spendMoney = scanner.nextInt();

        Cashing cashing = new Cashing();
        cashing.assay(myBalance, spendMoney);
    }

    public void assay(double myBalance, double spendMoney) {
        if (myBalance - (myBalance * 0.05) > spendMoney) {
            myBalance -= spendMoney + (spendMoney * 0.05);
            System.out.println("Возмите деньги...");
            System.out.println("Ваш баланс = " + myBalance);
        } else System.out.println("Недостаточно средств...");
    }
}