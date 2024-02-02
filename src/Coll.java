import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
public class Coll {

	
	public static void main(String[] args) {
//		List
		List<Integer> list = new ArrayList<>();
//		list.add(1);
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
		list1.add(5);
		System.out.println(list1.toString());
//		LinkedList
		List<Integer> list2 = new LinkedList<>();
		
//		Stack
		Stack<Integer> st = new Stack<>();
		st.push(10);
		
//		Queue
//		Queue<Integer> qu = 
		
//		Set
		Set<Integer> sht = new HashSet<>();
//		list.add(1);
		Set<Integer> sht1 = new LinkedHashSet<>();
		list1.add(5);
		System.out.println(list1.toString());
//		LinkedList
		Set<Integer> sht3 = new TreeSet<>();
		
//		Map
		Map<Integer,String> mp = new HashMap<>();
		Map<Integer,String> mp1 = new LinkedHashMap<>();
		System.out.println(list1.toString());
//		LinkedList
		Map<Integer,String> mp2 = new TreeMap<>();
		
		Map<String,String> mp3 = new HashMap<>();
		mp3.put("GS/LAB", null);
		mp3.put(null, "ARShlam");
		System.out.println(mp3);
		System.out.println("---------------------------");
		
		for(Map.Entry<String,String> entry : mp3.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}
}
