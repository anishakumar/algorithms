package algorithms;
import java.util.*;
public class MultiAnagram {
	
	
	public static void solveAnagram(String[] arr) {
	    HashMap<String, ArrayList<String>> Anag = new HashMap<>();
	    for (String str : arr) {
	        int a[] = new int[26];
	        for (int i = 0; i < 26; i++) a[i] = 0;
	        for (char ch : str.toCharArray()) {
	            a[ch - 'a']++;
	        }
	        String t = "";
	        for (int i = 0; i < 26; i++) {
	        	t += String.valueOf(a[i]);
	        }
	        if (Anag.containsKey(t)) {
	            Anag.get(t).add(str);
	        } else {
	            ArrayList<String> arrList = new ArrayList<String>();
	            arrList.add(str);
	            Anag.put(t, arrList);
	        }
	    }
	    
	    for (Map.Entry<String, ArrayList<String>> entry : Anag.entrySet()) {
	        ArrayList<String> arrList = entry.getValue();
	        for (String str : arrList) {
	            System.out.print(str + " ");
	        }
	        System.out.println(); // For new line
	    }
	}
	
public static void main(String args[]){
	String[] array = {"pot", "top", "tea", "ate", "eat", "cat"};
		
	solveAnagram(array);
		
	}


}
