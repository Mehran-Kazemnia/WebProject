package UI.Category;

import javax.swing.*;
import java.awt.*;

public class ArtMenu extends JFrame {
    private JButton sewingBtn;
    private JButton paintingBtn;
    private JButton embroideryBtn;
    private JButton calligraphyBtn;

    public ArtMenu(){
        this.setTitle("Art");
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
        add(sewingBtn);
        add(paintingBtn);
        add(embroideryBtn);
        add(calligraphyBtn);
    }

    private void setButtons() {
        ///////Sewing\\\\\
        sewingBtn =new JButton("خیاطی");
        Font font=sewingBtn.getFont().deriveFont(25.0f);
        sewingBtn.setFont(font);
        sewingBtn.addActionListener(e -> {

        });

        //////Painting\\\\
        paintingBtn =new JButton("نقاشی");
        paintingBtn.setFont(font);
        paintingBtn.addActionListener(e -> {

        });

        //////Embroidery\\\\\
        embroideryBtn =new JButton("گلدوزی");
        embroideryBtn.setFont(font);
        embroideryBtn.addActionListener(e -> {

        });

        /////Calligraphy\\\\
        calligraphyBtn =new JButton("خوشنویسی");
        calligraphyBtn.setFont(font);
        calligraphyBtn.addActionListener(e -> {

        });

    }

}
