package unitConverter;
import javax.swing.JOptionPane;
public class UnitConverter {
public static void main(String[] args) {
	String entered = JOptionPane.showInputDialog("Please enter your measurement");
	Double number = Double.parseDouble(entered.substring(0, entered.indexOf(" ")));
	String unit = entered.substring(entered.indexOf(" ") + 1);

	if (unit.equals("cm")) {
		number = number * 0.3937;
		unit = "inches";
	}
    if (unit.equals("inches")) {
    	number = number * 2.54;
    	unit = "cm";
    }
    if (unit.equals("yards")) {
    	number = number * 0.9144;
    	unit = "meters";
    }
    if (unit.equals("meters")) {
    	number = number * 1.0936;
    	unit = "yards";
    }
    if (unit.equals("ounces")) {
    	number = number * 28.3495;
    	unit = "grams";
    }
    if (unit.equals("grams")) {
    	number = number * 0.03527;
    	unit = "ounces";
    }
    if (unit.equals("pounds")) {
    	number = number * 0.4536;
    	unit = "kilograms";
    }
    if (unit.equals("kilograms")) {
    	number = number * 2.2046;
    	unit = "pounds";
    }
    
    
    System.out.println(number);
    System.out.println(unit);
    
    
    
    
    
    
    
    
   
	
}
 }
