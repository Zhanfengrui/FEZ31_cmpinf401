package lab7;
import java.util.Scanner;
public class lab7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [] data;
		int size;
		System.out.print("How many items will be entered?");
		size = input.nextInt();
		data = new double[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter the " + (i+1) + "th element in array");
			data[i] = input.nextDouble();	
		}
		System.out.println("Maximum element is " + max(data));
		System.out.println("Minimum element is " + min(data));
		System.out.println("Sum is " + sum(data));
		System.out.println("Average is " + average(data));
	}
	public static double max(double[] data) {
		double maxElement = data[0];
		for(int i=1;i<data.length;i++) {
			if(maxElement<data[i]);
			maxElement = data[i];
		}
		return maxElement;
	}
	public static double min(double[] data)
	{
		double minElement=data[0];
		for(int i=1;i<data.length;i++)
		{
			if(minElement>data[i])
				minElement=data[i];
		}
		return minElement;
	}
	public static double sum(double[] data)
	{
	double sum=0;
	for(int i=1;i<data.length;i++)
	sum+=data[i];
	return sum;
	}
	public static double average(double[] data)
	{
	double average=sum(data)/data.length;
	return average;
	}
}
