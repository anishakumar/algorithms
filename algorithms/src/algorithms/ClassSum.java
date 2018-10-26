package algorithms;
import java.util.*;
import java.util.Scanner;

public class ClassSum {
	
	public static int SumOfArray(int[] value){
		 int sum = 0;
		 
		 for(int i=0;i<value.length;i++){
			 
			 sum = sum + value[i];
		 }
		 
		return sum;
		
		
	}
	
	public static void main(String arg[]){
		
		int sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
	    int size = sc.nextInt();
	    int [] array = new int[size];
	    System.out.println("Enter array elements: ");
	    Scanner ar = new Scanner(System.in);
	    
	    for (int i =0;i<size;i++){
	    	array[i] = ar.nextInt();
	    }
	    
	    sum = SumOfArray(array);
	    System.out.println("The sum is " + sum + ".");
		
	}

}
