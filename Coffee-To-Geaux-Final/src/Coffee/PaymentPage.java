package Coffee;

import javax.swing.*;
import java.awt.*;

public class PaymentPage extends JFrame {
    JPanel paymentPanel;
    JButton cardButton, cashButton;
    JLabel cash, credit;
    JCheckBox cashCB, creditCB;
    Color cl = new Color(177, 156, 217);
    Color cl2 = new Color(253, 253, 150);

    public PaymentPage () {
        paymentPanel = new JPanel();
        paymentPanel.setBackground(cl2);

        // Elements in Payment Panel
        cash = new JLabel("Select Payment Method", Label.RIGHT);
        cardButton = new JButton("Card");
        cashButton = new JButton("Cash");
        cardButton.setForeground(cl);
        cashButton.setForeground(cl);

        // Add Elements
        paymentPanel.add(cash);
        paymentPanel.add(cardButton);
        paymentPanel.add(cashButton);

        add(paymentPanel);
        pack();
        setVisible(true);

        ButtonHandler bh7 = new ButtonHandler(this, 7);
        ButtonHandler bh8 = new ButtonHandler(this, 8);

        cardButton.addActionListener(bh7);
        cashButton.addActionListener(bh8);



    }
}
