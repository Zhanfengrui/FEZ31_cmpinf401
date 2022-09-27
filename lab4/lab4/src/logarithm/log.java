package logarithm;
import javax.swing.JOptionPane;
public class log {

	public static void main(String[] args) {


		boolean badX = true;
		while(badX)
		{
			int X = Integer.parseInt(JOptionPane.showInputDialog("Please provide a number for log"));
			if(X>0){
				badX = false;
			}


			boolean badb = true;
			while(badb)
			{
				int b = Integer.parseInt(JOptionPane.showInputDialog("Please provide a number for base"));
				if(b>1){
					badb = false;
					double Y = Math.log(X) / Math.log(b);
					double Doublevalue = Y;
					int intvalue = (int) Doublevalue;
					System.out.println(intvalue);




				}


			}

		}

	}
}