package algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static void checkAnagram(String word1, String word2){
		
		
		char[] wordone = word1.toCharArray();
		char[] wordtwo = word2.toCharArray();
		
		Arrays.sort(wordone);
		Arrays.sort(wordtwo);
		
		if (word1.length() != word2.length()){
			
			System.out.print("Given strings are not Anagrams");
	
		}
		int count =0;
		for (int i = 0;i<wordone.length;i++){

			
			if(wordone[i]==wordtwo[i]){
				
				count++;
		}
			
		}
		if (count==wordone.length){
			System.out.print("Done");
		}else
		{
			System.out.print("Not done");
		}
		
	}
	
	public static void main(String arg[]){
		System.out.print("Enter 1st string: ");
		Scanner one = new Scanner(System.in);
		String wordone = one.next();
		Scanner two = new Scanner(System.in);
		System.out.print("Enter 2nd string: ");
		String wordtwo = two.next();
		
		checkAnagram(wordone,wordtwo);
		
	}

}
