package com.company;

import javax.swing.*;
import javax.swing.JOptionPane;

public class NauticalMiles
{
    public static void main(String[] args)
    {
        String nauticalString;
        final double MILES = 1.150779;
        final double KMS = 1.852;
        int nautical;
        nauticalString = JOptionPane.showInputDialog("Enter the length in Nautical Miles",
                JOptionPane.INFORMATION_MESSAGE);
        nautical = Integer.parseInt(nauticalString);
        JOptionPane.showMessageDialog(null,"You entered " + nautical + " nautical miles.\nMiles: " + (nautical*MILES) + "\nKilometres: " + (nautical*KMS));

    }
}

