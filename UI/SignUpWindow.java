package UI;

import Files.SearchEngine;
import Files.User;
import Files.UsersIO;

import javax.swing.*;
import java.awt.*;

public class SignUpWindow extends JFrame {
    private SearchEngine engine;
    private UsersIO io;
    private JLabel headerLabel;
    private JPanel fieldsPanel;
    private JLabel usernameLabel;
    private JTextField usernameField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton submitBtn;

    public SignUpWindow() {
        engine=new SearchEngine();
        this.setTitle("Sign Up");
        this.setSize(300, 350);
        this.setLayout(new GridBagLayout());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setScene();
        setVisible(true);

    }

    private void setScene() {
        headerLabel = new JLabel("Sign Up");

        headerLabel.setFont(headerLabel.getFont().deriveFont(40.0f));

        fieldsPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gb = new GridBagConstraints();
        gb.gridx = 0;
        gb.gridy = 0;
        gb.weightx = 1;
        gb.weighty = 1;
        gb.fill = GridBagConstraints.NONE;

        gb.gridx = 1;
        gb.gridy = 0;
        ///////////////// Username line//////////////////
        usernameLabel = new JLabel("Username:  ");
        gb.gridy = 1;
        gb.gridx = 0;
        gb.anchor = GridBagConstraints.LINE_END;
        fieldsPanel.add(usernameLabel, gb);

        usernameField = new JTextField(8);
        gb.gridy = 1;
        gb.gridx = 1;
        gb.anchor = GridBagConstraints.LINE_START;
        fieldsPanel.add(usernameField, gb);

        ///////////////// Password line//////////////////
        passwordLabel = new JLabel("Password:  ");
        gb.gridy = 2;
        gb.gridx = 0;
        gb.anchor = GridBagConstraints.LINE_END;
        fieldsPanel.add(passwordLabel, gb);

        passwordField = new JPasswordField(8);

        gb.gridy = 2;
        gb.gridx = 1;
        gb.anchor = GridBagConstraints.LINE_START;
        fieldsPanel.add(passwordField, gb);

        submitBtn = new JButton("Submit");
        submitBtn.addActionListener(e -> submitAction());
        gb.gridy = 3;
        gb.gridx = 1;
        gb.anchor = GridBagConstraints.SOUTH;
        fieldsPanel.add(submitBtn, gb);
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
        if (!engine.isUserValid(username)) {

            User user = new User(username,pass);
            if (username.equalsIgnoreCase("admin")){
                user.set
            }
            this.setVisible(false);
            io.saveUser(user);
        }else {
            JOptionPane.showMessageDialog(null,
                    "This username is valid!",
                    "Failed!",JOptionPane.ERROR_MESSAGE);
        }
    }
}
