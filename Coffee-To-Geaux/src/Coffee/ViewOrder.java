package Coffee;

import javax.swing.*;
import java.awt.*;

public class ViewOrder extends JFrame {

    Color cl = new Color(177, 156, 217);
    Color cl2 = new Color(253, 253, 150);
    //Four JPanel's for Order page
    JPanel viewOrderPageLeft, viewOrderPageRight, viewOrderPageTop, viewOrderPageBottom;
    //Title's
    JLabel titleL;

    JButton submit;

    public ViewOrder() {

        viewOrderPageTop = new JPanel();
        viewOrderPageLeft = new JPanel();
        viewOrderPageRight = new JPanel();
        viewOrderPageBottom = new JPanel();
        viewOrderPageLeft.setPreferredSize(new Dimension(220, 550));

        titleL = new JLabel("Staff Page, Orders Listed Below");

        viewOrderPageLeft.setForeground(cl);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 550));
        getContentPane().setBackground(cl2);

        viewOrderPageTop.add(titleL);
        viewOrderPageTop.setBackground(cl);

        add(viewOrderPageTop, BorderLayout.NORTH);
        add(viewOrderPageLeft, BorderLayout.WEST);
        pack();
        setVisible(true); // make the frame visible

    }
}
