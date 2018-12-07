package Coffee;

import java.awt.*;
import java.util.Scanner;
import java.io.*;

import javax.swing.*;

public class CustomerLogin extends JFrame {
    Color cl = new Color(177, 156, 217);
    Color cl2 = new Color(253, 253, 150);
    JPanel customerPanel;
    JButton customerButton;
    TextField userFieldC, passFieldC;
    JLabel userLabelC, passLabelC;
    JLabel loginResultC;

    public CustomerLogin () {
        customerPanel = new JPanel();
        customerPanel.setBackground(cl2);

        //Elements for Customer Login Panel
        userFieldC = new TextField("", 20); // get a Text Field
        passFieldC = new TextField("", 20); // get a Text Field
        userLabelC = new JLabel("Customer User Name", Label.RIGHT);
        passLabelC = new JLabel("Customer Password", Label.RIGHT);
        customerButton = new JButton("Login");
        loginResultC = new JLabel("RESULT");

        userLabelC.setForeground(cl);
        passLabelC.setForeground(cl);

        //Add elements to Customer Login Panel
        customerPanel.add(userLabelC); // add label to panel
        customerPanel.add(userFieldC); // add text field to panel
        customerPanel.add(passLabelC); // add label to panel
        customerPanel.add(passFieldC); // add text field to panel
        customerPanel.add(customerButton);//add button
        customerPanel.add(loginResultC);
        add(customerPanel);
        pack();
        setVisible(true); // make the frame visible

        ButtonHandler bh3 = new ButtonHandler(this, 3);
        customerButton.addActionListener(bh3);
    }
    
    //Method reads from "LoginInfo.txt" and checks if input from userFieldC is present
    public boolean validateLoginC(){
    	try{
    	Scanner fileIn = new Scanner(new File("LoginInfoCust.txt"));
    	
    	String toCheck = userFieldC.getText();
    	
    	while(fileIn.hasNext()){
    		String checkUser = fileIn.next();
    		fileIn.next();

    		if(checkUser.equals(toCheck)){
    			return true;
    		}
    	}
    	loginResultC.setText("FAILED");
    	return false;
    	}catch(FileNotFoundException e){
    		
    		return false;
    	}

    }
}