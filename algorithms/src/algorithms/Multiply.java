package algorithms;

public class Multiply {

	public static void main(String arg[]){
		
		int limit = 1000;
		int sum = 0;
		
		for(int i =1; i<1000;i++){
			if(i%3 == 0 || i%5 == 0){
				System.out.println(i);
				sum = sum+i;
			}
		}
		
		System.out.println(sum);
		
	}
	
	
}
