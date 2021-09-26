package ex;

public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"ebay", null, "amazon", null, "ozon"};
        int max = 0;
        for (int i = 0; i < shops.length; i++) {
            String el = shops[i];
            if (el != null && el.length() > max) {
                max = el.length();
            }
        }
        System.out.println("max " + max);
    }
}
