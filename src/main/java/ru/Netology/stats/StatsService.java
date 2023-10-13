package ru.Netology.stats;

public class StatsService {
    public int calculateSalesSum(int[] sales) {
        int sumsales = 0;
        for (int sale : sales) {
            sumsales += sale;
        }
        return sumsales;
    }

    public int calculateAverageSum(int[] sales) {

        return calculateSalesSum(sales) / sales.length;
    }

    public int calculateMonthNumberOfMaxSale (int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int calculateMonthNumberOfMinSale(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int  calculateQuantityMonthWithSalesBelowAverage(int[] sales) {
        int month = 0;
        int averageSum = calculateAverageSum(sales);

        for (int sale : sales) {
            if (sale > averageSum){
                month += 1;
            }
        }
        return month;
    }

    public int calculateQuantityMonthWithSalesUnderAverage(int[] sales) {
        int month = 0;
        int averageSum = calculateAverageSum(sales);

        for (int sale : sales) {
            if (sale < averageSum) {
                month += 1;
            }
        }
        return month;

    }
}