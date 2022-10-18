public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long truncatedMean() {
        // находим минимальное значение
        long minValue = sales[0];
        for (long sale : sales) {
            if (sale < minValue) {
                minValue = sale;
            }
        }
        // находим максимальное значение, используя готовый метод
        long maxValue = max();
        // находим сумму всех продаж
        long sumOfSales = 0;
        for (long sale : sales) {
            sumOfSales += sale;
        }
        // находим среднее арифметическое без учета мин и макс значений
        long truncatedMean = (sumOfSales - minValue - maxValue) / (sales.length - 2);
        return truncatedMean;
    }
}
