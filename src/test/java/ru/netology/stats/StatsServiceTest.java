package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test    // 1. Сумма всех продаж.
    public void sumOfAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 180;
        int actualMonth = service.samOfAllSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test    // 2. Средняя сумма продаж в месяц.
    public void averageMonthlyAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 15;
        int actualMonth = service.averageMonthlyAllSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test    // 3. Номер месяца с максимальной продажей.
    public void maxSalesPerMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 7;
        int actualMonth = service.maxSalesPerMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test    // 4. Номер месяца с минимальной продажей.
    public void minSalesPerMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.minSalesPerMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test    // 5. Кол-во месяцев, где продажи ниже среднего.
    public void monthBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test    // 6. Кол-во месяцев, где продажи выше среднего.
    public void monthAboveAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.monthUndBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
