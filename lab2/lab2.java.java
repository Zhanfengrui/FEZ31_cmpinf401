package edu.pitt.problem1;

import javax.swing.JOptionPane;

public class problem1 {
	public static void main(String[] args) {
		String firstlength = JOptionPane.showInputDialog("How long is the first line?");
		String secondlength = JOptionPane.showInputDialog("How long is the second line?");
		
		double first = Double.parseDouble(firstlength);
		double second = Double.parseDouble(secondlength);
		
		double h = Math.sqrt((Math.pow(first,2.0) + Math.pow(second, 2.0)));
		String result = ("Hypotenuse equals to " + h);
	
		JOptionPane.showMessageDialog(null, result);
		
	}

}
