package javapjctpr;

public class RearrangeTheNumbers {

	public static void main(String[] args) {
		
		int arr[] = {10,5,8,7,4,9,6};
		int temp=0;
	int length = arr.length;
	 System.out.println();
	for(int i=0;i<length;i++) {
		for(int j=i+1; j<length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
		}
	}
     
     System.out.println("Elements of array sorted in ascending order: ");    
     for (int i = 0; i < arr.length; i++) {     
         System.out.print(arr[i] + " "); 
     }
	}

}
