package UI;

import Files.SearchEngine;
import Files.User;

import javax.swing.*;
import java.awt.*;

public class HomepageWindow extends JFrame {
    private User currentUser;
    private SearchEngine engine;
    private JButton exitBtn;
    private JButton searchBtn;
    private JButton menuBtn;
    private JButton aboutBtn;
    private JButton serviceBtn;


    public HomepageWindow(User currentUser,SearchEngine engine) {
        this.currentUser=currentUser;
        this.engine=engine;
        this.setTitle("Homepage");
        this.setSize(600, 600);
        this.setLayout(new GridBagLayout());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setButtons();
        setScene();
        setVisible(true);
    }

    private void setScene() {


        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        //////////////////First row///////////
        gc.gridy = 0;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        add(menuBtn, gc);

        gc.gridy = 0;
        gc.gridx = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(aboutBtn, gc);

        /////////////////Second row///////////
        gc.gridy = 1;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        add(serviceBtn, gc);

        gc.gridy = 1;
        gc.gridx = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(searchBtn, gc);

        ///////////////Third row/////////////

        gc.gridy = 2;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.CENTER;
        add(exitBtn, gc);


    }

    private void setButtons(){
        ///////Menu\\\\\\
        menuBtn = new JButton("Menu");
        menuBtn.addActionListener(e -> {
            new CategoryWindow();
        });

        ///////About\\\\\\
        aboutBtn = new JButton("About");
        aboutBtn.addActionListener(e -> {
            new TextViewer("file:///C:/Users/Sazgar/IdeaProjects/WebProject/about.html");
        });

        ///////Services\\\\\
        serviceBtn = new JButton("Service");

        //////Search\\\\\\\\
        searchBtn = new JButton("Search");

        ///////Exit\\\\\\\\
        exitBtn = new JButton("Exit");
        exitBtn.addActionListener(e -> {
            this.setVisible(false);
            new StartingWindow();
        });
    }

}
