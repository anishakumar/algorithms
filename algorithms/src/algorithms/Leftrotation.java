package algorithms;


import java.util.Scanner;

public class Leftrotation {
	
	public static void rotate(int[] array, int d){
		
		int[] narray = new int[array.length];
		
		int r = d%array.length;
			int index = 0;
			for(int i = r;i<array.length;i++){
				narray[index] = array[i];
				index++;
			}
			for(int i = 0;i<r;i++){
				narray[index] = array[i];
				index++;
			}
		for (int a: narray)
		System.out.print(a + " ");
		
		
	}
	
	public static void main(String arg[]){
		
		System.out.print("Enter the number of rotation: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		System.out.print("Enter the size of the array: ");
		Scanner arraysize = new Scanner(System.in);
		int size = arraysize.nextInt();
		
		System.out.println("Enter the array elements");
		Scanner array = new Scanner(System.in);
		
		int [] arr = new int[size];
		
		for (int i = 0; i <size;i++){
			
			arr[i] = array.nextInt();
		}
		
		rotate(arr,num);	
		
	}

}
