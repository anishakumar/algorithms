package algorithms;

import java.util.Scanner;

public class CircularArrayRotate {
	
	
	
	public static void circularArrayRotation(int[] array, int rot, int[] ind){
		
		
		
		
		int[] narray = new int[array.length];
	
		int r = (rot % array.length);
	    int k = array.length-r;
	    int index = 0;
		
	    for(int i = k; i < array.length; i++){
			narray[index] = array[i];
			index++;
		}
	    
	    for(int i = 0;i < k;i++){
			narray[index] = array[i];
			index++;
		}
		
		
		
		for(int i : ind){
		
			System.out.println(narray[i]);
		}
		
		
	}
	
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int rot = sc.nextInt();
		
		int query = sc.nextInt();
		
		
		int[] array = new int[size];
		
		for(int i = 0; i<size;i++){
			
			array[i] = sc.nextInt();
			
			
		}
		int[] ind = new int[query];
		
		for(int i = 0;i<query;i++){
			
			ind[i] = sc.nextInt();
		}
		
		
		circularArrayRotation(array,rot,ind);
		
		
	}


}
