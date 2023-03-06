package BigVending.model;

import BigVending.view.View;

public class ProductRepository {
    private Database productDB;
    private View view;

    public ProductRepository(View view) {
        this.view = view;
    }

    public void setProductBD(Database productDB) {
        this.productDB = productDB;
    }

    public void addProduct(Double cost, String name) {
        Product product = new Product(cost, name);
        if (check(product)) {
            productDB.createProductRow(product);
            view.answer("Товар добавлен");
        } else {
            view.answer("Такой товар уже существует");
        }
    }

    private boolean check(Product product) {
        if (productDB.getList().contains(product)) {
            return false;
        }
        return true;
    }

}
