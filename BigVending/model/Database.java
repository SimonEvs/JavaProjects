package BigVending.model;

import java.util.List;

public interface Database {
    List<Product> getList();

    int createProductRow(Product product);
}
