package algorithms;

import java.util.Scanner;

public class ReverseArray {
	
	public static int[] arrayreversal(int[] array){
		for(int i=0;i<array.length/2;i++){
			
			int temp = array[i];
			array[i]  = array[array.length-i-1];
			array[array.length-i-1] = temp;
			
		}
		return array;
		
	}
public static void main(String arg[]){
	
		Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
	    int [] array = new int[size];
	    Scanner ar = new Scanner(System.in);
	    
	    for (int i =0;i<size;i++){
	    	array[i] = ar.nextInt();
	    }
	    array = arrayreversal(array);
	    
	    for(int a: array)
	    	System.out.print(a + " ");
		
	}

}
		
		
