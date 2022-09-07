package edu.pitt.problem1;

import javax.swing.JOptionPane;

public class Problem3 {

	public static void main(String[] args) {
		
		String m = JOptionPane.showInputDialog("The amount of money is?");
		
		Integer M = Integer.parseInt(m);
		
		int g = M / 1000;
	     M = M % 1000;
	    int B = M / 100;
	     M = M % 100;
	    int s = M / 10;
	     M = M % 10;
	    int b = M / 1;
	    
	    String result = (g + " grands"  + B + " Benjamins" + s + " sawbucks" + b + " bucks");
	    JOptionPane.showMessageDialog(null, result);
		
	

	}

}
