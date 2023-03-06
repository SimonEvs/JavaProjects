package controller;

import model.PersonRepository;

public class MyController {
    private PersonRepository repository;

    public MyController(PersonRepository repository) {
        this.repository = repository;
    }

    public void signIn(String login, String password){
        repository.signIn(login, password);
    }

    public void signUp(String login, String password) {
        repository.signUp(login, password);
    }
}
