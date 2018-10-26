package algorithms;
import java.util.*;
import java.util.Scanner;

public class MinMaxSum {
	
	public static void minmaxSum(int[]array){
		Arrays.sort(array);
		for(int i : array){
			System.out.println(i);
		}
		long min = 0;
		long max = 0;
		for(int i= 0; i<array.length-1;i++){
			min = min + array[i];
			
		}
		for(int i= 1; i<array.length;i++){
			max = max + array[i];
			
		}
		
		System.out.println(min + " " + max);
	}

	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		

		int[] array = new int[5];
		
		for(int i = 0; i<5;i++){
			
			array[i] = sc.nextInt();
						
		}
		
		minmaxSum(array);
	}
}
