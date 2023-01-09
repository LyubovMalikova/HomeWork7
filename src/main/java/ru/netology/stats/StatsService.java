package ru.netology.stats;

public class StatsService {

    public int minSales(int[] sales) { // номер месяца, в котором были мин.продажи
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) { // номер месяца, в котором были макс.продажи
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int amount(int[] sales) { // сумма всех продаж
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSales(int[] sales) { // средняя сумма продаж в месяц
        int amount = amount(sales);
        int averageSales = amount / sales.length;
        return averageSales;
    }

    public int monthMinSales(int[] sales) { // кол-во месяцев, в которых продажи были ниже среднего
        double sum = 0;
        double average = averageSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public int monthMaxSales(int[] sales) { // кол-во месяцев, в которых продажи были выше среднего
        double sum = 0;
        double average = averageSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }
    }