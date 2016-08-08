package com.company;

import javax.swing.*;
import javax.swing.JOptionPane;

public class InchesToFeet
{
    public static void main(String[] args)
    {
        String inchesString;
        int inches;
        inchesString = JOptionPane.showInputDialog("Enter the length in inches",
                JOptionPane.INFORMATION_MESSAGE);
        inches = Integer.parseInt(inchesString);
        JOptionPane.showMessageDialog(null,"You entered " + inches + " inches.\nFeet: " + (inches/12) + "\nInches: " + (inches%12));

    }
}

