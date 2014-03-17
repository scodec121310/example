import java.util.ArrayList;


public class T16 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(85);
		a1.add(123);
		a1.add(205);	
		System.out.println(a1.toString());
		a1.add(1,3000000);
		System.out.println(a1.toString());
	}
}
