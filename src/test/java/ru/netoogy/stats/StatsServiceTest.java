package ru.netoogy.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void amountAllSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.amountAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSalesAmountTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 15;
        int actualSum = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void numberMonthMaxSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 8;
        int actualSum = service.maxSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void numberMonthMinSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 9;
        int actualSum = service.minSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void monthSalesHighAverageTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedHigh = 5;
        int actualHigh = service.monthSalesHighAverage(sales);

        Assertions.assertEquals(expectedHigh, actualHigh);
    }

    @Test
    public void monthSalesLowAverageTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedLow = 5;
        int actualLow = service.monthSalesLowAverage(sales);

        Assertions.assertEquals(expectedLow, actualLow);
    }

}
