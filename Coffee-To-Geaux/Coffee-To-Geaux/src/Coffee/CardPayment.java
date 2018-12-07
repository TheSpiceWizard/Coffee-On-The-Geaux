package Coffee;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CardPayment extends JFrame {
    NumberFormat formatter = new DecimalFormat("#0.00");
    Color cl = new Color(177, 156, 217);
    Color cl2 = new Color(253, 253, 150);
    //Four JPanel's for Order page
    JPanel cardPaymentPageLeft, cardPaymentPageRight, cardPaymentPageTop, cardPaymentPageBottom;
    //Title's
    JLabel titleL;
    CreateOrder cO2;
    JLabel jLSpace, jLSpace2, jLSpace3;

    JButton submitCard;
    JLabel cardNameL, cardNumberL, expDateL, cscL, title2L, total;
    JTextField cardNameT, cardNumberT, expDateT, cscT;

    public CardPayment() {

        cardPaymentPageTop = new JPanel();
        cardPaymentPageLeft = new JPanel();
        cardPaymentPageRight = new JPanel();
        cardPaymentPageBottom = new JPanel();
        cardPaymentPageLeft.setPreferredSize(new Dimension(400, 550));

        jLSpace = new JLabel("                      ");
        jLSpace2 = new JLabel("                                                        ");
        jLSpace3 = new JLabel("                                                                    ");

        titleL = new JLabel("Card Payment Page");
        title2L = new JLabel("Input Card Details Below                                                          ");
        cardNameL = new JLabel("Name:");
        cardNameT = new JTextField(25);
        cardNumberL = new JLabel("Card No:");
        cardNumberT = new JTextField(16);
        expDateL = new JLabel("Exp Date:");
        expDateT = new JTextField(5);
        cscL = new JLabel("CSC:");
        cscT = new JTextField(3);
        total = new JLabel("Your total is $" + formatter.format(cO2.totalCost));
        submitCard = new JButton("Complete Purchase");

        cardPaymentPageLeft.setForeground(cl);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 550));
        getContentPane().setBackground(cl2);

        cardPaymentPageTop.add(titleL);
        cardPaymentPageTop.setBackground(cl);

        cardPaymentPageLeft.add(title2L);
        cardPaymentPageLeft.add(cardNameL);
        cardPaymentPageLeft.add(cardNameT);
        cardPaymentPageLeft.add(cardNumberL, BorderLayout.LINE_START);
        cardPaymentPageLeft.add(cardNumberT);
        cardPaymentPageLeft.add(jLSpace);
        cardPaymentPageLeft.add(expDateL, BorderLayout.LINE_START);
        cardPaymentPageLeft.add(expDateT);
        cardPaymentPageLeft.add(jLSpace2);
        cardPaymentPageLeft.add(cscL, BorderLayout.LINE_START);
        cardPaymentPageLeft.add(cscT);
        cardPaymentPageLeft.add(jLSpace3);
        cardPaymentPageLeft.add(total, BorderLayout.LINE_START);
        cardPaymentPageLeft.add(submitCard);

        add(cardPaymentPageTop, BorderLayout.NORTH);
        add(cardPaymentPageLeft, BorderLayout.WEST);
        pack();
        setVisible(true); // make the frame visible

        ButtonHandler bh10 = new ButtonHandler(this, 10);
        submitCard.addActionListener(bh10);

    }
}
