package UI.Category;

import javax.swing.*;
import java.awt.*;

public class PsychologyMenu extends JFrame {
    private JButton[] articles =new JButton[3];

    public PsychologyMenu()  {
        this.setTitle("Psychology");
        this.setSize(600, 600);
        this.setLayout(new GridLayout(3,1));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setButtons();
        setScene();
        setVisible(true);
    }

    private void setScene() {
        Font font= articles[0].getFont().deriveFont(25.0f);
        for (int i = 0; i < articles.length; i++) {

            articles[i].setFont(font);
            add(articles[i]);
        }
    }

    private void setButtons() {
        //////\\\\\\
        articles[0]=new JButton("ویژگی افراد درونگرا");
        articles[0].addActionListener(e -> {

        });

        //////\\\\\\
        articles[1]=new JButton("ویژگی افراد برونگرا");
        articles[1].addActionListener(e -> {

        });

        //////\\\\\\
        articles[2]=new JButton("تاثیر رنگ ها");
        articles[2].addActionListener(e -> {

        });




    }
}
