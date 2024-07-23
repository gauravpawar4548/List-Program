
import java.util.ArrayList;
import java.util.Collections;
public class sortEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(10);
		
		Collections.sort(list);
		System.out.println("Ascending order:"+list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("descending order :"+list);
		
		

	}

}
