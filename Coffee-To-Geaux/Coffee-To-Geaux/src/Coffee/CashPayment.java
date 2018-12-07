package Coffee;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CashPayment extends JFrame {
    NumberFormat formatter = new DecimalFormat("#0.00");
    JPanel cashPaymentPanel;
    JButton exitButton;
    JLabel thankyouLabel;
    Color cl = new Color(177, 156, 217);
    Color cl2 = new Color(253, 253, 150);
    CreateOrder cO;

    public CashPayment () {
        cO = new CreateOrder();
        cashPaymentPanel = new JPanel();
        cashPaymentPanel.setBackground(cl2);

        // Elements in Payment Panel
        thankyouLabel = new JLabel("Thankyou, pay $" + formatter.format(cO.totalCost) + " at the till");
        exitButton = new JButton("Exit");
        exitButton.setForeground(cl);


        // Add Elements
        cashPaymentPanel.add(thankyouLabel);
        cashPaymentPanel.add(exitButton);


        add(cashPaymentPanel);
        pack();
        setVisible(true);

        ButtonHandler bh9 = new ButtonHandler(this, 9);
        exitButton.addActionListener(bh9);


    }


}
