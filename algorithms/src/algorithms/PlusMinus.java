package algorithms;
import java.util.*;
//https://www.hackerrank.com/challenges/plus-minus/problem
//https://www.hackerrank.com/challenges/strong-password/problem
public class PlusMinus {
	
	public static void plusminus(int [] array, float n){
		float counter = 0;
		float Postivefraction;
		float Negativefraction;
		for(int i = 0; i<array.length ;i++){
			
			if(array[i]> 0){
				 counter= counter+1;

			}else{
				counter = counter+1;
			}
			 
			
		}
		Postivefraction = counter/n;
		Negativefraction = counter/n;
		System.out.println(Postivefraction);
		System.out.println(Negativefraction);
		
		
		
	
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		for(int i = 0; i<array.length;i++){
			
			array[i] = sc.nextInt();
		}
		
		plusminus(array, size);
		
	}

}
