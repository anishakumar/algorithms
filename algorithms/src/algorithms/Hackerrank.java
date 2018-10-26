package algorithms;

import java.util.Scanner;

public class Hackerrank {
	
	public static String hackerrankInString(String hack){
		
		String word = "hackerrank";
		if(hack.length()<word.length()){
			return "NO";
		}
		
		int j = 0;
		for(int i = 0; i<hack.length(); i++){
			
			if (j< word.length() && word.charAt(j)== hack.charAt(i)){
				j++;
			}

			}			if(j==word.length()){
				return "YES";
			}
				else{
					return "NO";
				}
			
		}
		

	

	
	
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		String hack;		
		for(int i = 0; i < test; i++){
			hack = sc.next();
			System.out.println(hackerrankInString(hack));
	}
		
		
		
	}


}
