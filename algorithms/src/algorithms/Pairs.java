package algorithms;
import java.util.*;
public class Pairs {

	public static void pairs(int[] array, int total){
		Arrays.sort(array);
		HashMap<Integer, Integer> lookup = new HashMap<>();
		int count = 0;
		for(int i = 0; i<array.length;i++){
			
			if(lookup.containsKey(array[i]-total)){
				lookup.put(array[i], 1);
				count++;
				
			}else{
				lookup.put(array[i], 1);
			}
		}
		System.out.println(count);
		
	}
	
	public static void main(String arag[]){
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int total = sc.nextInt();
		int[] array = new int[test];
		for(int i =0; i<test;i++){
			array[i] = sc.nextInt();
		}
		
		
		pairs(array, total);
	}
}
