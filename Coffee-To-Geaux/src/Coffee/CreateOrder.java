package Coffee;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CreateOrder extends JFrame {
    JPanel createOrderPageLeft;
    JPanel createOrderPageRight;
    JPanel createOrderPageTop;
    JPanel createOrderPageBottom;

    JLabel titleL;
    JLabel hotDrinksL;
    JLabel chilledDrinksL;

    JCheckBox espressoC;
    JCheckBox doubleEspressoC;
    JCheckBox whiteCoffeeC;
    JCheckBox blackCoffeeC;
    JCheckBox cappuccinoC;
    JCheckBox latteC;

    JCheckBox icedCoffeeC;
    JCheckBox caramelFrapC;
    JCheckBox mochaFrapC;
    JCheckBox coffeeFrapC;
    JCheckBox icedTeaC;
    JCheckBox bottledWaterC;

    JTextField espressoT;
    JTextField doubleEspressoT;
    JTextField whiteCoffeeT;
    JTextField blackCoffeeT;
    JTextField cappuccinoT;
    JTextField latteT;

    JTextField icedCoffeeT;
    JTextField caramelFrapT;
    JTextField mochaFrapT;
    JTextField coffeeFrapT;
    JTextField icedTeaT;
    JTextField bottledWaterT;

    JButton submit;


    public CreateOrder() {

        submit = new JButton("Submit Order");

        createOrderPageTop = new JPanel();
        createOrderPageLeft = new JPanel();
        createOrderPageRight = new JPanel();
        createOrderPageBottom = new JPanel();
        createOrderPageLeft.setPreferredSize(new Dimension(220, 550));

        titleL = new JLabel("Welcome to Coffee-To-Geaux, Place Your Order");
        hotDrinksL = new JLabel("Hot Drinks: ");
        chilledDrinksL = new JLabel("Chilled Drinks: ");

        hotDrinksL.setForeground(Color.magenta);
        chilledDrinksL.setForeground(Color.magenta);


        espressoC = new JCheckBox("Espresso            ");
        doubleEspressoC = new JCheckBox("Double Espresso");
        whiteCoffeeC = new JCheckBox("White Coffee      ");
        blackCoffeeC = new JCheckBox("Black Coffee       ");
        cappuccinoC = new JCheckBox("Cappuccino        ");
        latteC = new JCheckBox("Latte                   ");

        espressoT = new JTextField(2);
        doubleEspressoT = new JTextField(2);
        whiteCoffeeT = new JTextField(2);
        blackCoffeeT = new JTextField(2);
        cappuccinoT = new JTextField(2);
        latteT = new JTextField(2);

        icedCoffeeC = new JCheckBox("Iced Coffee               ");
        caramelFrapC = new JCheckBox("Caramel Frappuccino");
        mochaFrapC = new JCheckBox("Mocha Frappuccino  ");
        coffeeFrapC = new JCheckBox("Coffee Frappuccino  ");
        icedTeaC = new JCheckBox("Iced Tea                    ");
        bottledWaterC = new JCheckBox("Bottled Water            ");

        icedCoffeeT = new JTextField(2);
        caramelFrapT = new JTextField(2);
        mochaFrapT = new JTextField(2);
        coffeeFrapT = new JTextField(2);
        icedTeaT = new JTextField(2);
        bottledWaterT = new JTextField(2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 550));
        getContentPane().setBackground(Color.YELLOW);

        createOrderPageTop.add(titleL);
        createOrderPageTop.setBackground(Color.magenta);

        createOrderPageLeft.add(hotDrinksL);
        JLabel jl = new JLabel("      ");
        JLabel jl2 = new JLabel("                         ");
        createOrderPageLeft.add(jl);

        createOrderPageLeft.add(espressoC,BorderLayout.LINE_START);
        createOrderPageLeft.add(espressoT, BorderLayout.LINE_END);
        createOrderPageLeft.add(jl2);

        createOrderPageLeft.add(doubleEspressoC, BorderLayout.LINE_START);
        createOrderPageLeft.add(doubleEspressoT, BorderLayout.LINE_END);
        createOrderPageLeft.add(jl2);

        createOrderPageLeft.add(whiteCoffeeC);
        createOrderPageLeft.add(whiteCoffeeT);
        createOrderPageLeft.add(jl2);

        createOrderPageLeft.add(blackCoffeeC);
        createOrderPageLeft.add(blackCoffeeT);
        createOrderPageLeft.add(jl2);

        createOrderPageLeft.add(cappuccinoC);
        createOrderPageLeft.add(cappuccinoT);
        createOrderPageLeft.add(jl2);

        createOrderPageLeft.add(latteC);
        createOrderPageLeft.add(latteT);

        createOrderPageLeft.add(jl2);

        createOrderPageLeft.add(chilledDrinksL);
        createOrderPageLeft.add(jl);
        createOrderPageLeft.add(icedCoffeeC);
        createOrderPageLeft.add(icedCoffeeT);
        createOrderPageLeft.add(jl2);
        createOrderPageLeft.add(caramelFrapC);
        createOrderPageLeft.add(caramelFrapT);
        createOrderPageLeft.add(jl2);
        createOrderPageLeft.add(mochaFrapC);
        createOrderPageLeft.add(mochaFrapT);
        createOrderPageLeft.add(jl2);
        createOrderPageLeft.add(coffeeFrapC);
        createOrderPageLeft.add(coffeeFrapT);
        createOrderPageLeft.add(jl2);
        createOrderPageLeft.add(icedTeaC);
        createOrderPageLeft.add(icedTeaT);
        createOrderPageLeft.add(jl2);
        createOrderPageLeft.add(bottledWaterC);
        createOrderPageLeft.add(bottledWaterT);
        createOrderPageLeft.add(jl2);
        createOrderPageLeft.add(submit);


        add(createOrderPageTop, BorderLayout.NORTH);
        add(createOrderPageLeft, BorderLayout.WEST);
        pack();
        setVisible(true); // make the frame visible

        ButtonHandler bh4 = new ButtonHandler(this, 4);
        submit.addActionListener(bh4);
    }
}
