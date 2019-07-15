package UI.Category;

import javax.swing.*;
import java.awt.*;

public class MusicMenu extends JFrame {
    private JButton[] instruments=new JButton[4];

    public MusicMenu()  {
        this.setTitle("Music");
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
        Font font=instruments[0].getFont().deriveFont(25.0f);
        for (int i = 0; i < instruments.length; i++) {

            instruments[i].setFont(font);
            add(instruments[i]);
        }
    }

    private void setButtons() {
        //////\\\\\\
        instruments[0]=new JButton("آلات بادی");
        instruments[0].addActionListener(e -> {

        });

        //////\\\\\\
        instruments[1]=new JButton("آلات زهی، کششی، زخمه ای ");
        instruments[1].addActionListener(e -> {

        });

        //////\\\\\\
        instruments[2]=new JButton("آلات ضربی");
        instruments[2].addActionListener(e -> {

        });

        //////\\\\\\
        instruments[3]=new JButton("آلات زهی کوبه ای");
        instruments[3].addActionListener(e -> {

        });


    }
}
