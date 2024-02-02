import java.util.ArrayList;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {

		List<Integer> list1=new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

        list1.forEach(  
        		
                (n)->{
                	if(n%2==0) {
                		
                	}
        		}
            ); 

	}




}