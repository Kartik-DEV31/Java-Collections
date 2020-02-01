import java.util.*;


class ListManager{
	
	public static void removeElement(ArrayList<String> list , ArrayList<String> list2) {
		
		ArrayList<String> list1 = new ArrayList<String>(list);
		ArrayList<String> list02 = new ArrayList<String>(list2);
		ArrayList<String> list3 = new ArrayList<String>(list1);
		
		list1.retainAll(list02);
		
		if (list1.size()>=1)
		System.out.print(list1);
		
		else 
			System.out.print(list3);
		
		
	}
	
}

public class collection1{
	
public static void main(String []args) {
	
	ArrayList<String> list = new ArrayList<String>();
	
	list.add("hello");
	list.add("world");
	list.add("lets do");
	list.add("Java");
	
	
ArrayList<String> list2 = new ArrayList<String>();
	
	list2.add("world");
	
	
	
	
	ListManager.removeElement(list,list2);
	
	
	
	
}
}