/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.io.Console;
public class App
{
    public static void main (String[] args)
    {
        Console con = System.console();
        String month = con.readLine();
        int num = Integer.parseInt(month);
        String monthString = switch (num) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            default -> "December";
        };
        System.out.println("The name of the month is " + monthString);
    }
}
