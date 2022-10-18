public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int truncatedMean() {
        // находим минимальное значение
        int minValue = sales[0];
        for (int sale : sales) {
            if (sale < minValue) {
                minValue = sale;
            }
        }
        // находим максимальное значение, используя готовый метод
        int maxValue = max();
        // находим сумму всех продаж
        int sumOfSales = 0;
        for (int sale : sales) {
            sumOfSales += sale;
        }
        // находим среднее арифметическое без учета мин и макс значений
        int truncatedMean = (sumOfSales - minValue - maxValue) / (sales.length - 2);
        return truncatedMean;
    }
}
