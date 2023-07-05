package ru.netology.Stats.services;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1;
    }

    public int sumSales(int[] sales) {
        int sum = 0; //

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum; // сумма всех продаж
    }

    public int averageSales(int[] sales) {
        int sum = sumSales(sales);
        int avg = sum / sales.length;
        return avg;
    }

    public int belowAverageSales(int[] sales) {
        int avg = averageSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                count ++;
            }
        }
        return count;
    }

    public int higherAverageSales(int[] sales) {
        int avg = averageSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                count ++;
            }
        }
        return count;
    }
}