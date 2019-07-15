package UI;

import UI.Category.*;

import javax.swing.*;
import java.awt.*;

public class CategoryWindow extends JFrame {
    private JButton[] titles = new JButton[5];

    public CategoryWindow() {
        this.setTitle("Category");
        this.setSize(270, 300);
        this.setLayout(new GridLayout(3,2));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setButtons();
        setScene();

        setVisible(true);


    }

    private void setButtons() {

        ////////Sport\\\\\\\\
        titles[0] = new JButton("ورزشی");
        titles[0].addActionListener(e -> {
            new SportMenu();
            this.setVisible(false);
        });

        ///////Music\\\\\\\
        titles[1] = new JButton("آلات موسیقی");
        titles[1].addActionListener(e -> {
            new MusicMenu();
            this.setVisible(false);
        });

        ///////Cooking\\\\\\\
        titles[2] = new JButton("آشپزی");
        titles[2].addActionListener(e -> {

            new CookingMenu();
            this.setVisible(false);
        });

        ///////Art\\\\\\\\\
        titles[3] = new JButton("هنری");
        titles[3].addActionListener(e -> {
            new ArtMenu();
            this.setVisible(false);
        });

        ///////Psychology\\\\\\
        titles[4] = new JButton("روانشناسی");
        titles[4].addActionListener(e -> {
            new PsychologyMenu();
            this.setVisible(false);
        });

    }

    private void setScene() {
            Font font=titles[0].getFont().deriveFont(20.0f);
        for (int i = 0; i < titles.length; i++) {
            titles[i].setFont(font);
            add(titles[i]);

        }
        /*GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.NONE;
        int counter = 0;
        for (int i = 0; i < 2 && counter < titles.length; i++) {

            for (int j = 0; j < 3 && counter < titles.length; j++) {
                gbc.gridx = j;
                gbc.gridy = i;
                add(titles[counter], gbc);
                counter++;
            }

        }*/
    }

}
