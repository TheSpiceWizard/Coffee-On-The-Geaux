package Coffee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
    HomePage theApp;// Declare button handler class that implements action listener
    CustomerLogin theApp2;
    StaffLogin theApp3;
    CreateOrder theApp4;
    OrderProcessing theApp5;
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
            if(theApp2.validateLogin() == true){
                CreateOrder cO = new CreateOrder();
                cO.setVisible(true);
            }
        }

        if (diff == 4){
            OrderProcessing oP = new OrderProcessing();
            oP.setVisible(true);
        }

        if (diff == 5){
            PaymentPage pP = new PaymentPage();
            pP.setVisible(true);
        }
    }
}