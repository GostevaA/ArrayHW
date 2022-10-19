package ru.netology.stats.ArrayHw.service;


public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++)
            sum += sales[i];
        return sum;
    }

    public long averageSale(long[] sales) {
        return sumSales(sales)/sales.length;
    }

    public int maxSale(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public int minSale(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int aboveAverage(long[] sales) {
        int count = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
    public int lessThanAverage(long[] sales) {
        int count = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }
}
