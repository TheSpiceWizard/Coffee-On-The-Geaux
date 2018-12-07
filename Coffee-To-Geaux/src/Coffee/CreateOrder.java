package Coffee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateOrder extends JFrame {
    public static Double totalCost = 0.00;
    final double[] coffeePrices = {1.00, 2.00, 2.50, 2.20, 2.80, 2.60, 2.50, 3.00, 3.00, 3.00, 1.20, 1.00};
    JCheckBox[] coffeeList;
    JTextField[] quantityList;
    double q;

    Color cl = new Color(177, 156, 217);
    Color cl2 = new Color(253, 253, 150);
    //Four JPanel's for Order page
    JPanel createOrderPageLeft, createOrderPageRight, createOrderPageTop, createOrderPageBottom;
    //Title's
    JLabel titleL, hotDrinksL, chilledDrinksL;
    //Price Label's
    JLabel espressoCPrice, doubleEspressoCPrice, whiteCoffeeCPrice, blackCoffeeCPrice, cappuccinoCPrice, latteCPrice;
    //Price Label's
    JLabel icedCoffeeCPrice, caramelFrapCPrice, mochaFrapCPrice, coffeeFrapCPrice, icedTeaCPrice, bottledWaterCPrice;

    //Hot Drinks check boxes
    JCheckBox espressoC, doubleEspressoC, whiteCoffeeC, blackCoffeeC, cappuccinoC, latteC;
    //Cold Drinks check boxes
    JCheckBox icedCoffeeC, caramelFrapC, mochaFrapC, coffeeFrapC, icedTeaC, bottledWaterC;
    //Hot Drink text fields
    JTextField espressoT, doubleEspressoT, whiteCoffeeT, blackCoffeeT, cappuccinoT, latteT;
    //Cold Drinks text fields
    JTextField icedCoffeeT, caramelFrapT, mochaFrapT, coffeeFrapT, icedTeaT, bottledWaterT;

    JButton submit;

    public CreateOrder() {
        JLabel jl = new JLabel();
        JLabel jl2 = new JLabel();

        submit = new JButton("Submit Order");

        createOrderPageTop = new JPanel();
        createOrderPageLeft = new JPanel();
        createOrderPageRight = new JPanel();
        createOrderPageBottom = new JPanel();
        createOrderPageLeft.setPreferredSize(new Dimension(290, 550));

        titleL = new JLabel("Welcome to Coffee-To-Geaux, Place Your Order");
        hotDrinksL = new JLabel("Hot Drinks:                       ");
        chilledDrinksL = new JLabel("Chilled Drinks:               ");

        createOrderPageLeft.setForeground(cl);
        hotDrinksL.setForeground(cl);
        chilledDrinksL.setForeground(cl);

        espressoCPrice = new JLabel("$1.00");
        doubleEspressoCPrice = new JLabel("$2.00");
        whiteCoffeeCPrice = new JLabel("$2.50");
        blackCoffeeCPrice = new JLabel("$2.20");
        cappuccinoCPrice = new JLabel("$2.80");
        latteCPrice = new JLabel("$2.60");
        icedCoffeeCPrice = new JLabel("$2.50");
        caramelFrapCPrice = new JLabel("$3.00");
        mochaFrapCPrice = new JLabel("$3.00");
        coffeeFrapCPrice = new JLabel("$3.00");
        icedTeaCPrice = new JLabel("$1.20");
        bottledWaterCPrice = new JLabel("$1.00");


        espressoC = new JCheckBox("Espresso              ", false);
        doubleEspressoC = new JCheckBox("Double Espresso ", false);
        whiteCoffeeC = new JCheckBox("White Coffee       ", false);
        blackCoffeeC = new JCheckBox("Black Coffee       ", false);
        cappuccinoC = new JCheckBox("Cappuccino        ", false);
        latteC = new JCheckBox("Latte                   ", false);

        espressoT = new JTextField(2);
        doubleEspressoT = new JTextField(2);
        whiteCoffeeT = new JTextField(2);
        blackCoffeeT = new JTextField(2);
        cappuccinoT = new JTextField(2);
        latteT = new JTextField(2);

        icedCoffeeC = new JCheckBox("Iced Coffee               ", false);
        caramelFrapC = new JCheckBox("Caramel Frappuccino", false);
        mochaFrapC = new JCheckBox("Mocha Frappuccino  ", false);
        coffeeFrapC = new JCheckBox("Coffee Frappuccino  ", false);
        icedTeaC = new JCheckBox("Iced Tea                   ", false);
        bottledWaterC = new JCheckBox("Bottled Water            ", false);

        icedCoffeeT = new JTextField(2);
        caramelFrapT = new JTextField(2);
        mochaFrapT = new JTextField(2);
        coffeeFrapT = new JTextField(2);
        icedTeaT = new JTextField(2);
        bottledWaterT = new JTextField(2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 550));
        getContentPane().setBackground(cl2);

        createOrderPageTop.add(titleL);
        createOrderPageTop.setBackground(cl);

        createOrderPageLeft.add(hotDrinksL);
        createOrderPageLeft.add(jl);

        createOrderPageLeft.add(espressoC);
        createOrderPageLeft.add(espressoT);
        createOrderPageLeft.add(espressoCPrice);
        createOrderPageLeft.add(jl2);

        createOrderPageLeft.add(doubleEspressoC);
        createOrderPageLeft.add(doubleEspressoT);
        createOrderPageLeft.add(doubleEspressoCPrice);
        createOrderPageLeft.add(jl2);

        createOrderPageLeft.add(whiteCoffeeC);
        createOrderPageLeft.add(whiteCoffeeT);
        createOrderPageLeft.add(whiteCoffeeCPrice);
        createOrderPageLeft.add(jl2);

        createOrderPageLeft.add(blackCoffeeC);
        createOrderPageLeft.add(blackCoffeeT);
        createOrderPageLeft.add(blackCoffeeCPrice);
        createOrderPageLeft.add(jl2);

        createOrderPageLeft.add(cappuccinoC);
        createOrderPageLeft.add(cappuccinoT);
        createOrderPageLeft.add(cappuccinoCPrice);
        createOrderPageLeft.add(jl2);

        createOrderPageLeft.add(latteC);
        createOrderPageLeft.add(latteT);
        createOrderPageLeft.add(latteCPrice);

        createOrderPageLeft.add(jl2);

        createOrderPageLeft.add(chilledDrinksL);
        createOrderPageLeft.add(jl);
        createOrderPageLeft.add(icedCoffeeC);
        createOrderPageLeft.add(icedCoffeeT);
        createOrderPageLeft.add(icedCoffeeCPrice);
        createOrderPageLeft.add(jl2);
        createOrderPageLeft.add(caramelFrapC);
        createOrderPageLeft.add(caramelFrapT);
        createOrderPageLeft.add(caramelFrapCPrice);
        createOrderPageLeft.add(jl2);
        createOrderPageLeft.add(mochaFrapC);
        createOrderPageLeft.add(mochaFrapT);
        createOrderPageLeft.add(mochaFrapCPrice);
        createOrderPageLeft.add(jl2);
        createOrderPageLeft.add(coffeeFrapC);
        createOrderPageLeft.add(coffeeFrapT);
        createOrderPageLeft.add(coffeeFrapCPrice);
        createOrderPageLeft.add(jl2);
        createOrderPageLeft.add(icedTeaC);
        createOrderPageLeft.add(icedTeaT);
        createOrderPageLeft.add(icedTeaCPrice);
        createOrderPageLeft.add(jl2);
        createOrderPageLeft.add(bottledWaterC);
        createOrderPageLeft.add(bottledWaterT);
        createOrderPageLeft.add(bottledWaterCPrice);
        createOrderPageLeft.add(jl2);
        createOrderPageLeft.add(submit);

        coffeeList = new JCheckBox[]{espressoC, doubleEspressoC, whiteCoffeeC, blackCoffeeC, cappuccinoC, latteC,
                icedCoffeeC, caramelFrapC, mochaFrapC, coffeeFrapC, icedTeaC, bottledWaterC};

        quantityList = new JTextField[]{espressoT, doubleEspressoT, whiteCoffeeT, blackCoffeeT, cappuccinoT, latteT,
                icedCoffeeT, caramelFrapT, mochaFrapT, coffeeFrapT, icedTeaT, bottledWaterT};

        add(createOrderPageTop, BorderLayout.NORTH);
        add(createOrderPageLeft, BorderLayout.WEST);
        pack();
        setVisible(true); // make the frame visible

        ButtonHandler bh4 = new ButtonHandler(this, 4);
        submit.addActionListener(bh4);
    }

    public Double totalCostMethod() {
        for (int i = 0; i < coffeeList.length; i++) {
            if (coffeeList[i].isSelected()) {
                totalCost += coffeePrices[i] * (q = Double.parseDouble(quantityList[i].getText().trim()));
            }
        }
        return totalCost;
    }
}
