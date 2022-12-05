package lab10;

public class lab10 {
	int x = 234;
	
	int sumOfDigits(int x) {
	    if (x < 0) {
	        return sumOfDigits(-1 * x);
	    } else if (x == 0) {
	        return 0;
	    } else {
	        return (x % 10) + sumOfDigits(x / 10);
	    }
	}
	
	
	void printArrayElements(int a[], int size){
	    if(size == 1){
	        System.out.println(a[size-1]);
	    }
	    else{
	        printArrayElements(a,size-1);
	        System.out.println(a[size-1]);
	    }
	}}
	