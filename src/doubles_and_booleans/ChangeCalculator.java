package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String five =
JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int nickel =
Integer.parseInt(five);
		// Ask the user how many dimes they have, and convert their answer
String ten =
JOptionPane.showInputDialog("How many dimes do you have?");
int dime = 
Integer.parseInt(ten);
		// Ask the user how many quarters they have, and convert their answer
String fourth = 
JOptionPane.showInputDialog("How many quarters do you have?");
int quarter =
Integer.parseInt(fourth);
		// Calculate how much money the user has and save it in a double variable
double total = 
+nickel/20+dime/10+quarter/4;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, total);
	}
}

