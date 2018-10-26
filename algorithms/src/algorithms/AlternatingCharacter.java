package algorithms;

import java.util.*;


public class AlternatingCharacter {
	
	public static void alternatingCharacters(String [] s, int num){
		
		for(int j = 0; j < num; j++){
			int count =0;
			char[] chars = s[j].toCharArray();
			for(int i=0;i<chars.length-1;i++){
				
				if(chars[i] == chars[i+1]){
					count++;
				}
					
						
				}
			
			System.out.println(count);;
		
		}
			
	}
		
		
	
	
	public static void main(String arg[]){
		
		Scanner no = new Scanner(System.in);
		
		int num = no.nextInt();
		
		String str[] = new String[num];
		
			for(int i = 0; i<num; i++){
				
				str[i] = no.next();
				
			}
			
			alternatingCharacters(str, num);
			
			
		
		
		
	}

}
