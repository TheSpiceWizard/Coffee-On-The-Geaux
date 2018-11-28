package Coffee;

import java.awt.*;
import javax.swing.*;

public class StaffLogin extends JFrame {
    JPanel staffPanel;
    JButton staffButton;
    TextField userFieldS, passFieldS;
    JLabel userLabelS, passLabelS;

    public StaffLogin ()  {
        staffPanel = new JPanel();

        //Elements for Staff Login Panel
        userFieldS = new TextField("", 20); // get a Text Field
        passFieldS = new TextField("", 20); // get a Text Field
        userLabelS = new JLabel("Staff User Name", Label.RIGHT);
        passLabelS = new JLabel("Staff Password", Label.RIGHT);
        userLabelS.setForeground(Color.BLUE);
        passLabelS.setForeground(Color.RED);
        staffButton = new JButton("Login");

        staffPanel.add(userLabelS); // add label to panel
        staffPanel.add(userFieldS); // add text field to panel
        staffPanel.add(passLabelS); // add label to panel
        staffPanel.add(passFieldS); // add text field to panel
        staffPanel.add(staffButton);//add button

        add(staffPanel);
        pack();
        setVisible(true); // make the frame visible

    }
}
