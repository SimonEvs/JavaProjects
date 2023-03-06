package view;

import controller.MyController;
import model.PersonRepository;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthorizationView extends JFrame implements View {
    private JLabel lPassword, lLogin, lResult, lAnswer;
    private TextField login, password;
    private Button signIn, signUp;
    private MyController controller;

    @Override
    public void init() {
        setSize(400, 300);
        password = new TextField();
        login = new TextField();
        lLogin = new JLabel("Логин: ");
        lPassword = new JLabel("Пароль: ");
        signUp = new Button("Войти");
        signIn = new Button("Зарегистрироваться");
        lResult = new JLabel();
        lAnswer = new JLabel();

        setLayout(new GridLayout(4, 2));
        add(lLogin);
        add(login);
        add(lPassword);
        add(password);
        add(lResult);
        add(lAnswer);
        add(signUp);
        add(signIn);

        signIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                controller.signIn(login.getText(), password.getText());
            }
        });

        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                controller.signUp(login.getText(), password.getText());
            }
        });

        setVisible(true);
    }

    @Override
    public void answer(String message) {
        lAnswer.setText(message);
    }

    @Override
    public void setController(MyController controller) {
        this.controller = controller;
    }
}
