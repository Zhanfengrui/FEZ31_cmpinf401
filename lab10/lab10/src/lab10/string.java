package lab10;
import java.util.Arrays;
import java.util.Scanner;

public class string {

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		int size;

		System.out.print("Enter size of array : ");

		size = s.nextInt();

		int[] A = new int[size];

		for(int i=0;i<size;i++){

			System.out.print("Enter element "+(i+1)+" : ");

			A[i] = s.nextInt();

		}

		int x;

		System.out.print("Enter value of X : ");

		x = s.nextInt();


		Arrays.sort(A);


		System.out.println("Combination is as below");

		findUniqueCombinations(A, "", 0,size, x);

	}

	public static void findUniqueCombinations(int[] A, String out, int i, int n, int x)

	{

		if (x > n) {

			return;

		}


		if (x == 0) {

			System.out.println(out);

			return;

		}

		for (int j = i; j < n; j++){

			findUniqueCombinations(A, out + " " + (A[j]) , j + 1, n, x - 1);

			while (j < n - 1 && A[j] == A[j + 1]) {

				j++;

			}

		}

	}

}