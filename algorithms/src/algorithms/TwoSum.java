package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static int[] Solution(int[] array,int target){
		
		
		
		
		 
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i =0;i<array.length;i++){
			if (hm.containsKey(target-array[i])){
				Integer val =hm.get(target-array[i]);
				System.out.println(val);
				return new int[]{val,i};
				
			}
			hm.put(array[i], i);
			
		}
		
		
		return new int[]{-1,-1};
	}
	
	public static void main(String args[]){
		
		int [] result = Solution(new int[]{2, 11, 9, 3}, 12);
		System.out.print(Arrays.toString(result));
		
	}
	
}
