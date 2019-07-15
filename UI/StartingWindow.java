package UI;





import javax.swing.*;
import java.awt.*;

public class StartingWindow extends JFrame {
    private JButton signUpBtn;
    private JButton loginBtn;
    private JPanel buttonsPanel;

    public StartingWindow(){
        this.setTitle("Welcome");
        this.setLayout(new BorderLayout());
        this.setSize(400,400);
        setButtonsPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void setButtonsPanel(){
       buttonsPanel=new JPanel(new BorderLayout());
        Dimension dim= buttonsPanel.getPreferredSize();
        dim.height=20;
        dim.width=400;
        buttonsPanel.setSize(dim);
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        signUpBtn=new JButton("Sign Up");
        signUpBtn.addActionListener(e -> signUpAction());
        loginBtn=new JButton("Login");
        loginBtn.addActionListener(e -> loginAction());
        buttonsPanel.add(loginBtn,BorderLayout.WEST);
        buttonsPanel.add(signUpBtn,BorderLayout.EAST);
        this.add(buttonsPanel,BorderLayout.SOUTH);


    }

    private void  loginAction(){
        this.setVisible(false);
        LoginWindow loginWindow=new LoginWindow();
    }

    private void signUpAction(){

    }

}
