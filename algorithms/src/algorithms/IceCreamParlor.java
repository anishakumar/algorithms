package algorithms;
import java.util.*;

public class IceCreamParlor {
	
	public static void icecreamParlor(int[] array, int total){
		
		HashMap<Integer, Integer> value = new HashMap<>();
		
		for(int i = 0; i < array.length; i++){
			if(value.containsKey(total-array[i])){
				
				System.out.println(value.get(total-array[i])+1 +" "+ (i+1));
				
				
			}else{
				 value.put(array[i], i);
			}
			
		}
		
		
	}
	
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		
		
		for(int j = 0; j<testcase;j++){
			int total = sc.nextInt();
			int flavors = sc.nextInt();
			int[] array = new int[flavors];
			for(int i = 0; i<flavors;i++){
				array[i]= sc.nextInt();
				
			}
			icecreamParlor(array, total);
		}
		
	
		
		
	}
	
	

}
