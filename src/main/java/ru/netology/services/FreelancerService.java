package ru.netology.services;

public class FreelancerService {
    public int calculateMonths(int income, int expenses, int threshold) {
        int money = 0; // Количество денег на счете
        int months = 0; // Месяц
        int leisure; // Расходы на отдых

        for (int month = 1; month <= 12; month++) {
            System.out.println("Месяц " + month + ". Денег " + money + ". ");
            if (money >= threshold) { // Буду отдыхать
                money -= expenses;
                leisure = money - (money / 3); // Расчет расходов на отдых
                money -= leisure; // Вычет расходов на отдых
                months++;
                System.out.println("Буду отдыхать. Потратил " + expenses + ", затем ещё " + leisure + ".");
            } else {
                money += income; // Буду работать
                money -= expenses;
                System.out.println("Придётся работать. Заработал " + income + ", потратил " + expenses + ". ");
            }
        }

        return months;

    }
}

