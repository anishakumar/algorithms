package algorithms;

import java.util.Scanner;

public class CamelCase {
	
	public static int camelcase(String words){
		
		
		char[] word = words.toCharArray();
		int count =0;
		for(int i = 0; i < word.length;i++){
			
			if(word[i] >= 'A' && word[i] <= 'Z'){
				
				count++;
				
			}
			
		}
		
		
		return count+1;
		
		
	}
	
	
	
	
	
public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		String word= sc.nextLine();		
		System.out.println(camelcase(word));
	}
}
	

