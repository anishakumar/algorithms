package algorithms;

import java.util.*;

public class FunnyString {
	
	public static void funnyString(String[] input){
		
		
		
	}
	
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		//int test = sc.nextInt();
		String input = sc.nextLine();
		char[] charra = input.toCharArray();
		
		   int sol = (int)charra[0]-(int)charra[1];
		   for(int i = 2; i< charra.length-1;i++){
			
		   if ((int)charra[i]-(int)charra[i+1]==sol){
			   System.out.print("fUNNY");
		   }else{
			   System.out.print("NOTfUNNY");
					 
		   }
		    
		   }
			
		}
		
		
		//String[] input = new String[test];
//		for(int i = 0; i < test; i++){
//			input[i]= sc.nextLine();
//		}
//		
		//funnyString(input);
	}


