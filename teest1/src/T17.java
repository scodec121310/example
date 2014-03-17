import java.util.LinkedList;
import java.util.NoSuchElementException;


public class T17 {

	public static void main(String[] args) {
		String exp="((((((123+456))*(2-3)))";
		LinkedList<Character> list = new LinkedList<Character>();
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '(')
				list.addFirst('(');
			else if (exp.charAt(i) == ')')
				try {
					list.removeFirst();
					
				} catch (NoSuchElementException e) {
					System.out.println("左括號太少"); 
					return;
				}
				
		}
		if(list.isEmpty())
			System.out.println("match!");
		else
			System.out.println("右太少");
	}

}
