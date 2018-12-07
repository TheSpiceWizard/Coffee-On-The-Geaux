package Coffee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
    HomePage theApp;// Declare button handler class that implements action listener
    CustomerLogin theApp2;
    StaffLogin theApp3;
    CreateOrder theApp4;
    OrderProcessing theApp5;
    PaymentPage theApp6;
    CashPayment theApp7;
    CardPayment theApp8;


    int diff;

    ButtonHandler(HomePage app, int d) {
        theApp = app;                                           //Create constructor for button handler class
        diff = d;
    }

    ButtonHandler(CustomerLogin app2, int d) {
        theApp2 = app2;                                           //Create constructor for button handler class
        diff = d;
    }

    ButtonHandler(StaffLogin app3, int d) {
        theApp3 = app3;                                           //Create constructor for button handler class
        diff = d;
    }

    ButtonHandler(OrderProcessing app5, int d) {
        theApp5 = app5;                                           //Create constructor for button handler class
        diff = d;
    }

    ButtonHandler(CreateOrder app4, int d) {
        theApp4 = app4;                                           //Create constructor for button handler class
        diff = d;
    }

    ButtonHandler(PaymentPage app6, int d) {
        theApp6 = app6;                                           //Create constructor for button handler class
        diff = d;
    }
    ButtonHandler(CashPayment app7, int d) {
        theApp7 = app7;                                           //Create constructor for button handler class
        diff = d;
    }

    ButtonHandler(CardPayment app8, int d) {
        theApp8 = app8;                                           //Create constructor for button handler class
        diff = d;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (diff == 1) {
            CustomerLogin cL = new CustomerLogin();
            cL.setVisible(true);
        }

        if (diff == 2) {
            StaffLogin sL = new StaffLogin();
            sL.setVisible(true);
        }

        if(diff == 3){
            if(theApp2.validateLoginC() == true){
                CreateOrder cO = new CreateOrder();
                cO.setVisible(true);
            }
        }

        if (diff == 4){
            theApp4.totalCostMethod();
            OrderProcessing oP = new OrderProcessing();
            oP.setVisible(true);
        }

        if (diff == 5){
            PaymentPage pP = new PaymentPage();
            pP.setVisible(true);
        }

        if (diff == 6){
            if(theApp3.validateLoginS() == true){
                ViewOrder vO = new ViewOrder();
                vO.setVisible(true);
            }
        }

        if (diff == 7){
            CardPayment cardP = new CardPayment();
            cardP.setVisible(true);
        }

        if (diff == 8){
            CashPayment cashP = new CashPayment();
            cashP.setVisible(true);
        }

        if (diff == 9){
            System.exit(0);
        }

        if (diff == 10){
            System.exit(0);
        }
    }
}