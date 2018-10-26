package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualizeArray {
	
	 
			public static void equalizeArray(int[] input){
				
				HashMap<Integer,Integer> findMax = new HashMap<Integer, Integer>();
				
				
				
				for(int i: input){
					if(findMax.containsKey(i)){
						Integer val = findMax.get(i);
						findMax.put(i,val+1);
					}else {
						findMax.put(i, 1);
					}
				}
				int max =0;
				for (Map.Entry<Integer, Integer> entry : findMax.entrySet()) {
				    if (entry.getValue()>max){
				    	max = entry.getValue();
				    }
				    
					
				    }
				    
				System.out.println(input.length-max);
				    
				    
			}
				
				
			
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int[] input = new int[test];
		
		for(int i = 0; i < test; i++){
			input[i]= sc.nextInt();
		}
		
		equalizeArray(input);
		
	}
	

}
