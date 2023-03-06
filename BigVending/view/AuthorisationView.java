package BigVending.view;

import javax.swing.*;

import BigVending.controller.VendController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthorisationView extends JFrame implements View {
    private JLabel lName, lPrice, lResult, lAnswer;
    private TextField name;
    private double price;
    private Button signIn, signUp;
    private VendController controller;

    @Override
    public void init() {
        setSize(400, 300);
        name = new TextField();
        price = new TextField();
        lPrice = new JLabel("Прайс: ");
        lName = new JLabel("Имя: ");
        signUp = new Button("Войти");
        signIn = new Button("Зарегистрироваться");
        lResult = new JLabel();
        lAnswer = new JLabel();

        setLayout(new GridLayout(4, 2));
        add(lPrice);
        add(price);
        add(lName);
        add(name);
        add(lResult);
        add(lAnswer);
        add(signUp);
        add(signIn);

        signIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                controller.signIn(price.getText(), name.getText());
            }
        });

        setVisible(true);
    }

    @Override
    public void answer(String message) {
        lAnswer.setText(message);
    }

    @Override
    public void setController(VendController controller) {
        this.controller = controller;
    }
}
