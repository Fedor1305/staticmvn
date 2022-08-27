package ru.netology.stats;

public class StatsService {

    public int totalOfAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageAmountOfSalesPerMonth(int[] sales) {
        int sum = totalOfAllSales(sales);
        int averageAmount = sum / 12;
        return averageAmount;
    }

    public int maxSales(int[] sales) {
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


    public int minSales(int[] sales) {
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

    public int belowAverage(int[] sales) {
        int averageAmount = averageAmountOfSalesPerMonth(sales);
        int month = 0;
        for (long t : sales) {
            if (t < averageAmount) {
                month += 1;
            }
        }
        return month;
    }

    public int aboveAverage(int[] sales) {
        int averageAmount = averageAmountOfSalesPerMonth(sales);
        int month = 0;
        for (long t : sales) {
            if (t > averageAmount) {
                month += 1;
            }
        }
        return month;
    }
}