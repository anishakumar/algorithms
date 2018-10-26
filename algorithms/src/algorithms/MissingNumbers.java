package algorithms;
import java.util.*;
public class MissingNumbers {
	
	public static void missingNumbers(int[] one, int[] two ){
		
		TreeMap<Integer, Integer> numbers = new TreeMap<Integer, Integer>();
		
		for(int i = 0; i < two.length; i++){
			if(numbers.containsKey(two[i])){
				Integer count = numbers.get(two[i]);
				numbers.put(two[i], count+1);
			}else {
				numbers.put(two[i], 1);
			}
		}
		
		for(int i = 0; i< one.length;i++){
			if(numbers.containsKey(one[i])){
				Integer count = numbers.get(one[i]);
				numbers.put(one[i], count-1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : numbers.entrySet()){
			
			int key = entry.getKey();
			
			if(entry.getValue()>0){
				System.out.print(key+" ");
			}
			
		}
	
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int wordIn = sc.nextInt();
		int[] one = new int[wordIn];
		for(int i = 0; i < wordIn;i++){
			one[i] = sc.nextInt();
		}
		
		int worDIn = sc.nextInt();
		int[] two = new int[worDIn];
		for(int i = 0; i < worDIn;i++){
			two[i] = sc.nextInt();
		}
		
//		int[] one = {11, 4, 11, 7, 13, 4, 12, 11, 10, 14};
//		int[] two = {11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12};
		
		missingNumbers(one, two);
		
	}

}
