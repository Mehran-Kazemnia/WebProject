package UI;


import Files.SearchEngine;
import Files.User;

import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame {
    private SearchEngine engine;
    private JLabel headerLabel;
    private JPanel fieldsPanel;
    private JLabel usernameLabel;
    private JTextField usernameField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton submitBtn;

    public LoginWindow() {
        engine=new SearchEngine();
        this.setTitle("Login");
        this.setSize(300, 350);
        this.setLayout(new GridBagLayout());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setScene();
        setVisible(true);

    }

    private void setScene() {
        headerLabel = new JLabel("Login");

        headerLabel.setFont(headerLabel.getFont().deriveFont(40.0f));

        fieldsPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.NONE;

        gbc.gridx = 1;
        gbc.gridy = 0;
        ///////////////// Username line//////////////////
        usernameLabel = new JLabel("Username:  ");
        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        fieldsPanel.add(usernameLabel, gbc);

        usernameField = new JTextField(8);
        gbc.gridy = 1;
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        fieldsPanel.add(usernameField, gbc);

        ///////////////// Password line//////////////////
        passwordLabel = new JLabel("Password:  ");
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        fieldsPanel.add(passwordLabel, gbc);

        passwordField = new JPasswordField(8);

        gbc.gridy = 2;
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        fieldsPanel.add(passwordField, gbc);

        submitBtn = new JButton("Submit");
        submitBtn.addActionListener(e -> submitAction());
        gbc.gridy = 3;
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.SOUTH;
        fieldsPanel.add(submitBtn, gbc);
        fieldsPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 40));

        GridBagConstraints gc = new GridBagConstraints();
        gc.gridy = 0;
        gc.gridx = 0;
        gc.weighty = 1;
        gc.weightx = 1;
        gc.fill = GridBagConstraints.VERTICAL;

        add(headerLabel, gc);

        gc.gridy = 1;
        gc.gridx = 0;


        add(fieldsPanel, gc);
    }

    private void submitAction() {

        String username = usernameField.getText();
        String pass = passwordField.getText();
        if (!engine.isUserValid(username, pass)) {

            User user = engine.getUser(username);
            this.setVisible(false);
            HomepageWindow homepageWindow = new HomepageWindow(user,engine);
        }else {
            JOptionPane.showMessageDialog(null,
                    "Invalid username or password!",
                    "Not Found!",JOptionPane.ERROR_MESSAGE);
        }
    }


}
