import java.util.ArrayList;
public class ArrayLAddEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>Li = new ArrayList<>();
		
		Li.add(5);
		Li.add(6);
		Li.add(7);
		Li.add(8);
		Li.add(9);
		Li.add(10);
		
		System.out.println(Li);
		
		System.out.println(Li.get(5));// access the element
		
		
		System.out.println(Li);//print element simple way
		
		for(int i=0;i<Li.size();i++) // print array using For Loop
		{
			System.out.print(Li.get(i));
		}
		