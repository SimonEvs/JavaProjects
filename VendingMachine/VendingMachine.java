package VendingMachineProject;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine() {
        this(new ArrayList<>());
    }

    public List<Product> getProductsList() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
        return products;
    }

    VendingMachine(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProductByCost(double cost) {
        List<Product> res = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCost() == cost) {
                res.add(products.get(i));
            }
        }
        return res;
    }
}