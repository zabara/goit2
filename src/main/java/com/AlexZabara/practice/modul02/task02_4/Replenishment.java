package main.java.com.AlexZabara.practice.modul02.task02_4;

import java.util.Scanner;

public class Replenishment {
    public static void main(String[] args) {
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double[] spenMoney = {1200, 250, 2000, 500, 3200};
        Replenishment replenishment = new Replenishment();
        replenishment.assay(ownerNames, spenMoney);
    }

    public void assay(String ownerNames[], double spenMoney[]) {
        Scanner scanner = new Scanner(System.in);
        String stringName = scanner.nextLine();
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(stringName)) {
                System.out.println("Сусса которую хотите пополнить... = ");
                double money1 = scanner.nextInt();
                spenMoney[i] += money1;//можно вставить "  - (money1 * 0.05)  " это будет снимать процент за пополнение
                System.out.println("Ваш баланс = " + spenMoney[i]);

            }
        }
    }
}
