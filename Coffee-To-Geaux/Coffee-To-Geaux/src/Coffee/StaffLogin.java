package Coffee;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;

public class StaffLogin extends JFrame {
    JPanel staffPanel;
    JButton staffButton;
    TextField userFieldS, passFieldS;
    JLabel userLabelS, passLabelS;
    JLabel loginResultS;
    Color cl = new Color(177, 156, 217);
    Color cl2 = new Color(253, 253, 150);

    public StaffLogin ()  {
        staffPanel = new JPanel();
        staffPanel.setBackground(cl2);

        //Elements for Customer Login Panel
        userFieldS = new TextField("", 20); // get a Text Field
        passFieldS = new TextField("", 20); // get a Text Field
        userLabelS = new JLabel("Staff User Name", Label.RIGHT);
        passLabelS = new JLabel("Staff Password", Label.RIGHT);
        staffButton = new JButton("Login");
        loginResultS = new JLabel("RESULT");

        userLabelS.setForeground(cl);
        passLabelS.setForeground(cl);

        //Add elements to Customer Login Panel
        staffPanel.add(userLabelS); // add label to panel
        staffPanel.add(userFieldS); // add text field to panel
        staffPanel.add(passLabelS); // add label to panel
        staffPanel.add(passFieldS); // add text field to panel
        staffPanel.add(staffButton);//add button
        staffPanel.add(loginResultS);
        add(staffPanel);
        pack();
        setVisible(true); // make the frame visible

        ButtonHandler bh6 = new ButtonHandler(this, 6);
        staffButton.addActionListener(bh6);

    }

    //Method reads from "LoginInfo.txt" and checks if input from userFieldC is present
    public boolean validateLoginS(){
        try{
            Scanner fileIn = new Scanner(new File("LoginInfoStaff.txt"));

            String toCheck = userFieldS.getText();

            while(fileIn.hasNext()){
                String checkUser = fileIn.next();
                fileIn.next();

                if(checkUser.equals(toCheck)){
                    return true;
                }
            }
            loginResultS.setText("FAILED");
            return false;
        }catch(FileNotFoundException e){

            return false;
        }

    }
}
