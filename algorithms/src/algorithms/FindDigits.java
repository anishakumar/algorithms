package algorithms;
import java.util.*;
public class FindDigits {
	
	public static void findDigits(int[] array){
		
		for(int i =0; i< array.length;i++){
			int count =0;
			int number = array[i];
			while(array[i]>0){
				int val = array[i] % 10;
				  if (val > 0 && (number % val)==0){
					  
					   count++;
				  }
				 
					
					array[i] = array[i] /10;
				}
				
				System.out.println(count);
				
			}
			
			
		}
		
		
		
		
		
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int [] array = new int[size];
		for(int i = 0; i<size; i++){
			array[i] = sc.nextInt();
		}
		
		
		findDigits(array);
		
	}

}
