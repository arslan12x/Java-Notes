package arrays;

class ReturnArray{  
 
	int[] get(int [] a){  
		
	return a ;  
	} 
}

public class ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnArray obj = new ReturnArray();

			int arr[]=new int[]{10,30,50,90,60}; 
			obj.get(arr);
			for(int i=0;i<arr.length;i++)  
			System.out.println(arr[i]);  
			 

	}

}
