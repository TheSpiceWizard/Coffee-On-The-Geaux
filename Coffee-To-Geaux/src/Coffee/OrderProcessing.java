package Coffee;

import oracle.jvm.hotspot.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import static com.sun.glass.ui.Cursor.setVisible;

public class OrderProcessing extends JFrame {
    NumberFormat formatter = new DecimalFormat("#0.00");
    JPanel orderProcessPanel;
    JButton continueOrder;
    JLabel cashTotal;
    Color cl = new Color(177, 156, 217);
    Color cl2 = new Color(253, 253, 150);
    CreateOrder cO;

    public OrderProcessing () {
        cO = new CreateOrder();
        orderProcessPanel = new JPanel();
        orderProcessPanel.setBackground(cl2);

        // Elements in Payment Panel
        cashTotal = new JLabel("Your Order Total is $" + formatter.format(cO.totalCost));
        continueOrder = new JButton("Continue to Payment Options");
        continueOrder.setForeground(cl);


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
