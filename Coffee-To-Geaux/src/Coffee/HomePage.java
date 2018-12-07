package Coffee;

import java.awt.*;
import javax.swing.*;

public class HomePage extends JFrame {
    JPanel homePage;
    JButton homeButtonC, homeButtonS;
    Color cl = new Color(177, 156, 217);
    Color cl2 = new Color(253, 253, 150);

    public HomePage(){
        homePage = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 300));
        homePage.setBackground(cl2);

        //Elements for Home Panel
        homeButtonC = new JButton("Customer Login");
        homeButtonS = new JButton("Manager Login");

        homeButtonC.setForeground(cl);
        homeButtonS.setForeground(cl);

        //Add elements to Home Panel
        homePage.add(homeButtonC);
        homePage.add(homeButtonS);

        //Add panels to frame
        add(homePage);
        pack();
        setVisible(true); // make the frame visible

        ButtonHandler bh1 = new ButtonHandler(this, 1);
        ButtonHandler bh2 = new ButtonHandler(this, 2);

        homeButtonC.addActionListener(bh1);
        homeButtonS.addActionListener(bh2);                             //Register instance of event handler as a listener
    }
}