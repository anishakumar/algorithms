package algorithms;

import java.util.Map.Entry;
import java.util.*;

public class LoneyInteger {
	
	
	public static void lonelyInteger(ArrayList<Integer> array){
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(Integer i: array){
			
			if(map.containsKey(i)){
				Integer oldvalue = map.get(i);
				map.put(i, oldvalue+1);
				System.out.println(map);
			}
				else{
					map.put(i, 1);
				}
			}
		
		for (Entry<Integer, Integer> entry : map.entrySet())
			 {
			
			if(entry.getValue()==1){
				
				 System.out.println(entry.getKey());
				
			}
	        
	      }
		}
		
		
		
		
	
	
	
	public static void main(String args[]){
		
		Scanner num = new Scanner(System.in);
		
		int n = num.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>(n);
		
		
		for(int i =0; i<n;i++){
			
			arr.add(num.nextInt());
			
			
		}
		
		lonelyInteger(arr);
		
		
		
		
	}

}
