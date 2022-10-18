public class Main {
    public static void main(String[] args) {
        long[] sales = {1, 3, 4, 456};

        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
