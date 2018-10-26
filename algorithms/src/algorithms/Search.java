package algorithms;

import java.util.HashSet;

public class Search {
	
	//union of two arrays
	
	public static void union(int[] array1, int[] array2){
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<array1.length;i++){
			hs.add(array1[i]);
		}
		
		for(int i=0;i<array2.length;i++){
			hs.add(array2[i]);
		}
		
		System.out.println(hs);
		
	}
	
	//intersection of two arrays
	
	public static void intersection(int[] array1, int[] array2){
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<array1.length;i++){
			hs.add(array1[i]);
		}
		
		for(int i=0;i<array2.length;i++){
			if(hs.contains(array2[i]))
			hs.remove(array2[i]);
		}
		
		System.out.println(hs);
		
	}
	
	public static void main(String args[]){
		
		int[] array1 = {8,9,10,6,7};
		int[] array2= {1,2,8,9,10};
		
		union(array1,array2);
		intersection(array1,array2);
		
		
		
	}

}
