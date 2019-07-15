package UI.Category;

import javax.swing.*;
import java.awt.*;

public class CookingMenu extends JFrame {
    private JButton[] foods=new JButton[10];

    public CookingMenu() {
        this.setTitle("Cooking");
        this.setSize(600, 600);
        this.setLayout(new GridLayout(5,2));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setButtons();
        setScene();
        setVisible(true);
    }

    private void setScene() {
        Font font=foods[0].getFont().deriveFont(25.0f);
        for (int i = 0; i < foods.length ; i++) {
            foods[i].setFont(font);
            add(foods[i]);
        }
    }

    private void setButtons() {
        ////////\\\\\\\\
        foods[0]=new JButton("طرز تهیه قرمه سبزی");
        foods[0].addActionListener(e -> {

        });

        ////////\\\\\\\\
        foods[1]=new JButton("طرز تهیه شله زرد");
        foods[1].addActionListener(e -> {

        });

        ////////\\\\\\\\
        foods[2]=new JButton("طرز تهیه بامیه");
        foods[2].addActionListener(e -> {

        });

        ////////\\\\\\\\
        foods[3]=new JButton("طرز تهیه کمپوت گیلاس");
        foods[3].addActionListener(e -> {

        });

        ////////\\\\\\\\
        foods[4]=new JButton("طرز تهیه فلافل");
        foods[4].addActionListener(e -> {

        });

        ////////\\\\\\\\
        foods[5]=new JButton("طرز تهیه حلوا");
        foods[5].addActionListener(e -> {

        });

        ////////\\\\\\\\
        foods[6]=new JButton("طرز تهیه فرنی");
        foods[6].addActionListener(e -> {

        });

        ////////\\\\\\\\
        foods[7]=new JButton("طرز تهیه سالاد ماکارونی");
        foods[7].addActionListener(e -> {

        });

        ////////\\\\\\\\
        foods[8]=new JButton("طرز تهیه لازانیا");
        foods[8].addActionListener(e -> {

        });

        ////////\\\\\\\\
        foods[9]=new JButton("طرز تهیه لوبیا پلو");
        foods[9].addActionListener(e -> {

        });





















    }
}
