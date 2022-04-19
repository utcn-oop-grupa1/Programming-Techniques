package presentation;
//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class OrderView extends JPanel {
    private JComboBox prodCombo;
    private JLabel instrLabel;
    private JTextField clientField;
    private JTextField quantField;
    private JLabel clientLabel;
    private JLabel quantLabel;
    private JLabel prodLabel;
    private JButton orderButton;

    public OrderView() {
        //construct preComponents
        String[] jcomp1Items = {"Item 1", "Item 2", "Item 3"};

        //construct components
        prodCombo = new JComboBox (jcomp1Items);
        instrLabel = new JLabel ("Create an order below!");
        clientField = new JTextField (5);
        quantField = new JTextField (5);
        clientLabel = new JLabel ("Choose the ID of the client:");
        quantLabel = new JLabel ("Write the quantity:");
        prodLabel = new JLabel ("Choose the desired product:");
        orderButton = new JButton ("Place Order");

        //adjust size and set layout
        setPreferredSize (new Dimension (410, 245));
        setLayout (null);
        setBackground(Color.darkGray);

        //add components
        add (prodCombo);
        add (instrLabel);
        add (clientField);
        add (quantField);
        add (clientLabel);
        add (quantLabel);
        add (prodLabel);
        add (orderButton);

        prodCombo.setBounds (195, 60, 185, 25);
        prodCombo.setBackground(Color.gray);
        instrLabel.setBounds (5, 20, 295, 25);
        instrLabel.setForeground(Color.white);
        clientField.setBounds (195, 100, 185, 25);
        quantField.setBounds (195, 140, 185, 25);
        clientLabel.setBounds (5, 100, 170, 25);
        clientLabel.setForeground(Color.white);
        quantLabel.setBounds (5, 140, 170, 25);
        quantLabel.setForeground(Color.white);
        prodLabel.setBounds (5, 60, 175, 25);
        prodLabel.setForeground(Color.white);
        orderButton.setBounds (90, 185, 210, 45);
        orderButton.setBackground(Color.gray);
        orderButton.setForeground(Color.black);
    }


    public void display(){
        JFrame frame = new JFrame ("Create an order!");
        frame.setBackground(Color.darkGray);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (this);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible (true);
    }

    public void addActionListeners(ActionListener actionListener){
        orderButton.addActionListener(actionListener);
    }
}
