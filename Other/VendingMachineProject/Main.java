package Other.VendingMachineProject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        VendingMachine vendingMachine = new VendingMachine(products);
        // Food chocolate = new Food(50, "Kit Kat", 100);
        // Bottle bottle = new Bottle(100, "Sprite", 2);
        // Other phonecharger = new Other(1000, "Phone Charger", null);
        // Other phonecharger1 = new Other(1500, "Phone Charger", "Большой");

        products.add(new Food(50, "Snickers", 95));
        products.add(new Bottle(100, "Sprite", 2));
        products.add(new Food(50, "Kit Kat", 100));
        products.add(new Other(1000, "Phone Charger", null));
        products.add(new Other(1500, "Phone Charger", "Большой"));

        vendingMachine.getProductsList();
        System.out.println();
        vendingMachine.getProductByCost(50);

    }
}