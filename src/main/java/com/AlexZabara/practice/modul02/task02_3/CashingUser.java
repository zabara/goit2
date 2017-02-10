package main.java.com.AlexZabara.practice.modul02.task02_3;

import java.util.Scanner;

public class CashingUser {

    public static void main(String[] args) {
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double[] spenMoney = {1200, 250, 2000, 500, 3200};
        CashingUser cashingUser = new CashingUser();
        cashingUser.assay(ownerNames, spenMoney);
    }

    public void assay(String ownerNames[], double spenMoney[]) {
        Scanner scanner = new Scanner(System.in);
        String stringName = scanner.nextLine();
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(stringName)) {
                System.out.println("Сусса которую хотите снять... = ");
                double money1 = scanner.nextInt();
                if (money1 + (money1 * 0.05) <= spenMoney[i]) {
                    spenMoney[i] -= money1 + (money1 * 0.05);
                    System.out.println("Возмите деньги...");
                    System.out.println("Ваш баланс = " + spenMoney[i]);
                } else System.out.println("Недостаточно средств...");
            }
        }
    }
}