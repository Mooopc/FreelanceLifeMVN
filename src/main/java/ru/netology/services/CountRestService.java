package ru.netology.services;

public class CountRestService {
    public int calculate(int threshold, int income, int expenses) {
        int count = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                int currentMoney = money;
                System.out.printf("Месяц " + month + ". Денег " + money + ". Буду отдыхать. Потратил -" + expenses);
                money = (money - expenses) / 3;
                System.out.printf(", затем еще -" + (currentMoney - expenses - money) + "\n");
            } else {
                System.out.printf("Месяц " + month + ". Денег " + money + ". Буду работать. Заработал +" + income);
                money = money + income - expenses;
                System.out.printf(", потратил -" + expenses + "\n");
            }
        }
        System.out.printf("\n");
        return count;
    }
}
