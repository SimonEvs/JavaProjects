package BigVending;

import BigVending.controller.VendController.MyController;
import BigVending.model.ProductDB;
import BigVending.model.ProductRepository;
import BigVending.view.AuthorisationView;
import BigVending.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new AuthorisationView();
        ProductRepository repo = new ProductRepository(view);
        repo.setProductBD(new ProductDB());
        MyController controller = new MyController(repo);
        view.setController(controller);
        view.init();
    }
}
