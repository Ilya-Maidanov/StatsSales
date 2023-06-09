package ru.netoogy.stats;

public class StatsService {

    public int amountAllSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSalesAmount(int[] sales) {

        int average = amountAllSales(sales) / sales.length;
        return average;

    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthSalesHighAverage(int[] sales) {

        int average = averageSalesAmount(sales);
        int highSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                highSale++;
            }
        }
        return highSale;
    }

    public int monthSalesLowAverage(int[] sales) {

        int average = averageSalesAmount(sales);
        int lowSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                lowSale++;
            }
        }
        return lowSale;
    }

}
