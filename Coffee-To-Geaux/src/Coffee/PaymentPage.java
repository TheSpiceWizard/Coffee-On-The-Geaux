package Coffee;

import javax.swing.*;
import java.awt.*;

public class PaymentPage extends JFrame {
    JPanel paymentPanel;
    JButton paymentButton;
    JLabel cash, credit;
    JCheckBox cashCB, creditCB;

    public PaymentPage () {
        paymentPanel = new JPanel();
        paymentPanel.setBackground(Color.YELLOW);

        // Elements in Payment Panel
        cash = new JLabel("Cash (Pay at counter)", Label.RIGHT);
        credit = new JLabel("Credit/Debit", Label.RIGHT);
        paymentButton = new JButton("Continue");
        cashCB = new JCheckBox("");
        creditCB = new JCheckBox("");
        paymentButton.setForeground(Color.magenta);

        // Add Elements
        paymentPanel.add(cash);
        paymentPanel.add(cashCB);
        paymentPanel.add(credit);
        paymentPanel.add(creditCB);
        paymentPanel.add(paymentButton);


        add(paymentPanel);
        pack();
        setVisible(true);

    }
}
