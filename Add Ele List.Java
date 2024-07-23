import java.util.ArrayList;

public class AddEleIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		list.add(1,4);              //adding element at some Index
		System.out.println(list);
		
		
		list.set(2, 5);       // modified element at index
		System.out.println(list);
	
	}

}
