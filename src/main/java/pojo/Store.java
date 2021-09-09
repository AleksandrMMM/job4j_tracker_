package pojo;

public class Store {

    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product oil = new Product("Oil", 11);

        Product[] products = new Product[3];
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;
        products[0] = oil;

        for (Product pro: products) {
            if (pro.getCount() > 10) {
                System.out.println(pro.getName() + " " + pro.getCount());
            }
        }

    }
}
