package src;

public class Main {
    public static void main(String[] args) {
        long[] price = {20, 30, 10};

        SalesManager sales = new SalesManager(price);
        System.out.println("Sale max = " + sales.max());
    }
}
