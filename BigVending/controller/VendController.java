package BigVending.controller;

import BigVending.model.ProductRepository;

public class VendController {
    public class MyController {
        private ProductRepository repository;

        public MyController(ProductRepository repository) {
            this.repository = repository;
        }

        public void signIn(Double cost, String name) {
            repository.signIn(cost, name);
        }

        // public void signUp(String login, String password) {
        // repository.signUp(login, password);
        // }
    }

}