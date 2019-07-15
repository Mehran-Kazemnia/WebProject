package UI;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class TextViewer extends JFrame {
    private String source;
    private JScrollPane scrollPane;
    private JEditorPane showPane;

    public TextViewer(String source)  {
        this.setTitle("View");
        this.source = source;
        this.setSize(800,800);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);
        setShowPane();
    }

    private void setShowPane() {
        try {
            showPane = new JEditorPane(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
        showPane.setContentType("text/html");
        showPane.setEditable(false);
        scrollPane=new JScrollPane(showPane);

        add(scrollPane,BorderLayout.CENTER);
    }
}
