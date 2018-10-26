package algorithms;

public class BinarySearch {
	
	public static int binarySearch(int[] array, int x){
		
		int low = 0;
		int high = array.length-1;
		
		while(low<=high){
			
			int mid = (low+high)/2;
			if(array[mid]==x){
				return mid;
			}else if(x<array[mid]){
				high = mid-1;
				
			}else{
				low = mid+1;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String args[]){
		int[] array= {2,3,4,8,9,10};
		
		
		System.out.println(binarySearch(array , 8));
	}

}
