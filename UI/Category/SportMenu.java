package UI.Category;

import javax.swing.*;
import java.awt.*;

public class SportMenu extends JFrame{

    private JButton soccerBtn;
    private JButton volleyballBtn;
    private JButton tennisBtn;
    private JButton basketballBtn;

    public SportMenu(){
        this.setTitle("Sport");
        this.setSize(600, 600);
        this.setLayout(new GridLayout(2,2));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setButtons();
        setScene();
        setVisible(true);
    }

    private void setScene() {
        add(soccerBtn);
        add(volleyballBtn);
        add(tennisBtn);
        add(basketballBtn);
    }

    private void setButtons() {
        ///////Soccer\\\\\
        soccerBtn=new JButton("فوتبال");
        Font font=soccerBtn.getFont().deriveFont(30.0f);
        soccerBtn.setFont(font);
        soccerBtn.addActionListener(e -> {

        });

        //////Volleyball\\\\
        volleyballBtn=new JButton("والیبال");
        volleyballBtn.setFont(font);
        volleyballBtn.addActionListener(e -> {

        });

        //////Tennis\\\\\
        tennisBtn=new JButton("تنیس");
        tennisBtn.setFont(font);
        tennisBtn.addActionListener(e -> {

        });

        /////Basketball\\\\
        basketballBtn=new JButton("بسکتبال");
        basketballBtn.setFont(font);
        basketballBtn.addActionListener(e -> {

        });

    }

}
