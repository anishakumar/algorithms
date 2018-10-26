package algorithms;
import java.util.*;

public class ElectronicsShop {
	
	public static int getMoneySpent(int b,ArrayList<Integer> KeyPrice, ArrayList<Integer> USBprice ){
		
		Collections.sort(KeyPrice);
		Collections.sort(USBprice);
		System.out.println(KeyPrice);
		System.out.println(USBprice);
//		
//		for (Iterator<Integer> iter = KeyPrice.iterator();  iter.hasNext(); ) {
//			
//			if(iter.next()>=b){
//				
//				iter.remove();
//			}
//			
//		}
//		
//		for (Iterator<Integer> iter = USBprice.iterator(); iter.hasNext(); ) {
//			
//			if(iter.next()>=b){
//				
//				iter.remove();
//			}
//			
//		}
//		
		
		int maxKey = Collections.max(KeyPrice);
		int maxUsb = Collections.max(USBprice);
		
		for ( int i =0; i<USBprice.size();i++){
			int total = maxKey+  USBprice.get(i);
			if (total<=b){
				
				return total;
			}
				
				else{
					return 0;
				}
				
			}
		
		return 0;
		}
		
		
		
		
	
	
	public static void main(String args[]){
		
		Scanner b = new Scanner(System.in);
		int budget = b.nextInt();
		
		//Scanner k = new Scanner(System.in);
		int key = b.nextInt();
		
		//Scanner u = new Scanner(System.in);
		int usb = b.nextInt();
		
		int num;
		ArrayList<Integer> Kp = new ArrayList<Integer>(key);
		for(int i = 0;i<key;i++){
			
			num = b.nextInt();
			if (num < budget)
				Kp.add(num);
		}
		
		ArrayList<Integer> Up = new ArrayList<Integer>(usb);
		for(int i = 0;i<usb;i++){
			num = b.nextInt();
			if (num < budget)
				Up.add(num);
		}

		
		System.out.println(getMoneySpent(budget, Kp, Up));
		
		
		
	}

}
