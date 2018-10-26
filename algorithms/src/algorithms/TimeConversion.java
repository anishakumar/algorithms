package algorithms;
import java.util.Scanner;
import java.util.*;
public class TimeConversion {
	
	//things learnt from this
	//substring
	//parsing string to integer
	//.equals method
	
	public static void militarytime(String times){
		
		String hour = times.substring(0,2);
		int hh = Integer.parseInt(hour);
		
		String min = times.substring(3,5);
		
		String sec = times.substring(6,8);
		
		
		String format = times.substring(8,10);
		
		if (hh == 12 && format.equals("AM")) {
			hour= "00";
			System.out.println(hour+":"+min+":"+sec);
				
		}else if(hh < 12 && format.equals("AM")){
			
			System.out.println(hour+":"+min+":"+sec);
		}else if(hh>12 && format.equals("AM")){
			
			System.out.println(hour+":"+min+":"+sec);
			
		}
	
		
		
		if (hh < 12 && format.equals("PM")){
			
			hh+=12;
			System.out.println(hh+":"+min+":"+sec);
			
		}else if(hh == 12 && format.equals("PM")){
			
			System.out.println(hour+":"+min+":"+sec);
			
		}else if(hh>12 && format.equals("PM")){
			
			System.out.println(hour+":"+min+":"+sec);
			
		}
	}
	
	public static void main(String []args){
		
		Scanner input = new Scanner(System.in);
	//System.out.println("Enter the time in 12Hr format: ");
		String normaltime;
		normaltime = input.nextLine();
		
		militarytime(normaltime);
		
	}

}
