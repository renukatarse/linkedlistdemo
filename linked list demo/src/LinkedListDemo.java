import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		l.set(0,"software");
		l.add("venky");
		l.removeLast();
		l.addFirst("ccc");
		System.out.println(l);

	}

}
