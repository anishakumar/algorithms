package algorithms;

import java.util.*;

public class Rotleft {
	
	public static void rotleft(int[] array, int rot){
		
		int[] narray = new int[array.length];
		int r = rot % array.length;
		
		int index = 0;
		
		for(int i = r; i < array.length; i++){
			
			narray[index] = array[i];
			index++;		
			
		}
		for(int i = 0;i<r;i++){
			narray[index] = array[i];
			index++;
		}
		
		for(int i : narray){
			System.out.print(i+" ");
		}  
		
	
		
		
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int rot = sc.nextInt();
		
		int[] array = new int[size];
		
		for(int i = 0; i<size;i++){
			
			array[i] = sc.nextInt();
			
			
		}
		
		rotleft(array,rot);
		
		
	}

}
