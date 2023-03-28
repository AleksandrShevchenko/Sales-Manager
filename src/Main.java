package src;

public class Main {
    public static void main(String[] args) {
        long[] price = new long[] {20, 30, 10};


        SalesManager sales = new SalesManager(price);

        long max = sales.max();
        long min = sales.min();
        long average = sales.average();

        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}
