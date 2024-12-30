package collectionProgram;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<String>list=new LinkedList<String>();
		
		list.add("ragu");
		list.add("amma");
		list.add("family");		
		System.out.println(list);		
		list.addFirst("god");
		list.addLast("money");		
		System.out.println(list);
		list.add(1, "world");
		System.out.println(list);
		
	//	list.clear();
		System.out.println(list);
		
	 boolean con=  list.contains("amma");
	 System.out.println( list.getFirst());
	 list.getFirst();
	 System.out.println(  list.set(1,"erer"));
	 System.out.println(list);

	}

}
