package Coffee;

import oracle.jvm.hotspot.jfr.JFR;

import javax.swing.*;
import java.awt.*;

import static com.sun.glass.ui.Cursor.setVisible;

public class OrderProcessing extends JFrame {
    JPanel orderProcessPanel;
    JButton continueOrder;
    JLabel cashTotal;

    public OrderProcessing () {
        orderProcessPanel = new JPanel();
        orderProcessPanel.setBackground(Color.YELLOW);

        // Elements in Payment Panel
        cashTotal = new JLabel("Your Order Total is $6.00");
        continueOrder = new JButton("Continue to Payment Options");
        continueOrder.setForeground(Color.magenta);


        // Add Elements
        orderProcessPanel.add(cashTotal);
        orderProcessPanel.add(continueOrder);


        add(orderProcessPanel);
        pack();
        setVisible(true);

        ButtonHandler bh5 = new ButtonHandler(this, 5);
        continueOrder.addActionListener(bh5);


    }
}
