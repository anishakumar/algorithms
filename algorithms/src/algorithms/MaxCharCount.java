package algorithms;
import java.util.*;
import java.util.HashMap;

public class MaxCharCount {
	
	public static void CharCount(String array){
		
		char[] chars = array.toCharArray();
		
		HashMap<Character,Integer> hp = new HashMap<Character,Integer>();
		
		for(char c: chars ){
			if(hp.containsKey(c)){
				Integer oldvalue = hp.get(c);
				hp.put(c, oldvalue+1);
			}else{
				hp.put(c, 1);
				}
			
			}
		
		for (Map.Entry<Character, Integer> entry : hp.entrySet()) {
		    String key = entry.getKey().toString();
		    Integer value = entry.getValue();
		    if (value>1){
		    	System.out.println("key, " + key + " value " + value);
		    }
		    
		}
		
		}
		
	//Arrays.sort(input);
//	
//	int[] array = new int[101];
//	for(int i = 0; i < input.length; i ++){
//		
//		array[input[i]]++;
//		
//		
//	}
//	int max = 0;
//	for(int i = 1; i<=100;i++){
//		if(max<array[i]){
//			max = array[i];
//		}
//	}
//	int fin = input.length-max;
//	System.out.println(fin);
	

	
	public static void main(String args[]){
		
		CharCount("AaAa");
		
	}
}
