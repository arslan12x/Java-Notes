package arrays;

class ArraysImp{
	void show() {
	int arr[] = new int[6];
	for(int i=0;i<arr.length;i++) {
		arr[i]=i;
		}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}

	}
}
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  
			int a[]={33,3,4,5};

			for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);  
			}
			ArraysImp obj = new ArraysImp();
			obj.show();
		
	}

}
