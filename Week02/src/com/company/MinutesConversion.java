package com.company;

import javax.swing.*;
import java.util.Scanner;

public class MinutesConversion
{
    public static void main(String[] args)
    {
        String timeString;
        int time;
        final int HOURS = 60;
        final double DAYS = 1440;
        timeString = JOptionPane.showInputDialog("Enter the time in minutes",
                JOptionPane.INFORMATION_MESSAGE);
        time = Integer.parseInt(timeString);
        JOptionPane.showMessageDialog(null,"You entered: " + time + " Minutes\nHours: " + time/HOURS + "\nDays: " + time/DAYS);
    }
}