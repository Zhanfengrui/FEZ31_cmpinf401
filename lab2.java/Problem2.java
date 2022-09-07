package edu.pitt.problem1;

import javax.swing.JOptionPane; 

public class Problem2 {

	public static void main(String[] args) {
		String r = JOptionPane.showInputDialog("r equals to ?");
		
		Double R = Double.parseDouble(r);
	double P = 2.0*Math.PI*R;
	double A = Math.PI*Math.pow(R, 2.0);
	String result = ("The circle with radius " + R + "has an area of " + A + "and a perimeter of " + P);
	
	JOptionPane.showMessageDialog(null, result);
			
	}

}
