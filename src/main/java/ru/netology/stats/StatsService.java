package ru.netology.stats;

public class StatsService {

    public int samOfAllSales(int[] sales) {
        int maxSales = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        //сумма всех продаж
        return maxSales;
    }

    public int averageMonthlyAllSales(int[] sales) {
        int maxSales = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        //средняя сумма продаж вмесяц
        maxSales /= 12;
        return maxSales;
    }

    public int maxSalesPerMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }

    public int minSalesPerMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int monthBelowAverage(int[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageMonthlyAllSales(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthUndBelowAverage(int[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageMonthlyAllSales(sales)) {
                counter++;
            }
        }
        return counter;
    }
}