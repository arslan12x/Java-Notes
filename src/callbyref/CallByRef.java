package callbyref;

class Emp{
	int x=1234;
	int show(Emp e) {
		return x;
	}
}


public class CallByRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp obj=new Emp();
		System.out.println(obj.show(obj));

	}

}
