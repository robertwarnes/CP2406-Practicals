package com.company;

import javax.swing.*;
import javax.swing.JOptionPane;

public class Eggs
{
    public static void main(String[] args)
    {
        String eggsString;
        final double DOZEN = 3.25;
        final double LOOSE = 0.45;
        int eggs;
        eggsString = JOptionPane.showInputDialog("Enter the number of eggs you wish to order ",
                JOptionPane.INFORMATION_MESSAGE);
        eggs = Integer.parseInt(eggsString);
        JOptionPane.showMessageDialog(null,"You ordered " + eggs + " eggs. That's " + (eggs / 12) + " dozen " +
                "at $" + DOZEN + " per dozen and " + eggs%12 + " loose eggs at " + LOOSE + " cents each for a total of $"
                + (((eggs /12) * DOZEN)+((eggs%12) * LOOSE)));

    }
}
