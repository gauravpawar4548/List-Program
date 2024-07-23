import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class ArrayReverceList {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println("Order List:"+list);
		Collections.reverse(list);
		System.out.println("Reverced list :"+list);
		
		
		
		


	}

}
