package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class FindMedian {
	
	public static void findMedian(int[] input){
		
		Arrays.sort(input);
		
		int mid = input.length/2;
		
		System.out.println(input[mid]);
		
		
	}
	
	
	
public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int[] input = new int[test];
		
		for(int i = 0; i < test; i++){
			input[i]= sc.nextInt();
		}
		
		findMedian(input);
		
	}

}
