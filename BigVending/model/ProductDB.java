package BigVending.model;

import java.util.ArrayList;
import java.util.List;

public class ProductDB implements Database {
    private int lastId;
    private List<Product> list;

    public ProductDB() {
        lastId = 0;
        list = new ArrayList<>();
        createProductRow(new Product(5, "1234"));
        createProductRow(new Product(4, "235"));
        createProductRow(new Product(100, "777"));
        createProductRow(new Product(100, "666"));
    }

    public List<Product> getList() {
        return list;
    }

    public int createProductRow(Product person) {
        // person.setId(lastId++);
        list.add(person);
        return 1;
    }
}