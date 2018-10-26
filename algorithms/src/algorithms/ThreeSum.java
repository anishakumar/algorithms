package algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class ThreeSum {
	
public static void Solution(int[] array,int target){
		int sum =0 ;
		for(int i = 0; i< array.length;i++){
			sum = 0;
			for(int j = i+1; j < array.length-1; j++){
				sum = array[i] + array[j]+array[j+1];
				if (sum == target){
					System.out.println("Done");
				}
				
			}
		}
		
		//System.out.println("NotDone");
		
	}
	
	public static void main(String args[]){
		
		int[] array = {2, 4, 3, 5, 6};
		int target = 16;
		Solution(array, target);
		
	}
}
