package lab5;
import java.util.Scanner;
import java.util.Random;
public class MyDice {

	public static void main(String[] args) {
		{
			Scanner myscanner=new Scanner(System.in);
			Random myrandom=new Random();		
			while(true) {		
				System.out.print("Please provide the number of rolls:");
				int myRolls=myscanner.nextInt();
				RollDice(myRolls, myrandom);
				System.out.println("If you want to continue, type yes, otherwise, type no");
				Scanner myfirstscanner =  new Scanner(System.in);
				String myChar = myfirstscanner.nextLine();
				if(myChar.equalsIgnoreCase("yes")) {
					continue;
				}
				else {
					break;
				}
			}
		}
	}
	
	
	
	public static void RollDice(int numberofrolls,Random myrandom) {
		int random1;
		int random2;
		int counter2=0;
		int counter3=0;
		int counter4=0;
		int counter5=0;
		int counter6=0;
		int counter7=0;
		int counter8=0;
		int counter9=0;
		int counter10=0;
		int counter11=0;
		int counter12=0;
		for(int i=0;i<numberofrolls;i++)
		{
			random1=myrandom.nextInt(6)+1;
			random2=myrandom.nextInt(6)+1;
			switch (random1+random2)
			{
			case 2:
				counter2++;
				break;
			case 3:
				counter3++;
				break;
			case 4:
				counter4++;
				break;
			case 5:
				counter5++;
				break;
			case 6:
				counter6++;
				break;
			case 7:
				counter7++;
				break;
			case 8:
				counter8++;
				break;
			case 9:
				counter9++;
				break;
			case 10:
				counter10++;
				break;
			case 11:
				counter11++;
				break;
			case 12:
				counter12++;
				break;
			}
		}
		System.out.println("Number of 2 occurred:" + counter2 + "fraction=" + counter2 + "/" + numberofrolls);
		System.out.println("Number of 3 occurred:" + counter3 + "fraction=" + counter3 + "/" + numberofrolls);
		System.out.println("Number of 4 occurred:" + counter4 + "fraction=" + counter4 + "/" + numberofrolls);
		System.out.println("Number of 5 occurred:" + counter5 + "fraction=" + counter5 + "/" + numberofrolls);
		System.out.println("Number of 6 occurred:" + counter6 + "fraction=" +counter6 + "/"+numberofrolls);
		System.out.println("Number of 7 occurred:" + counter7 + "fraction=" +counter7 + "/"+numberofrolls);
		System.out.println("Number of 8 occurred:" + counter8 + "fraction=" +counter8 + "/"+numberofrolls);
		System.out.println("Number of 9 occurred:" + counter9 + "fraction=" +counter9 + "/"+numberofrolls);
		System.out.println("Number of 10 occurred:" + counter10 + "fraction=" + counter10 + "/"+numberofrolls);
		System.out.println("Number of 11 occurred:" + counter11 + "fraction=" + counter11 + "/"+numberofrolls);
		System.out.println("Number of 12 occurred:" + counter12 + "fraction=" + counter12 + "/"+numberofrolls);
	}

}