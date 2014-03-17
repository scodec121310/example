import java.util.*;

import javax.print.attribute.standard.DateTimeAtCompleted;
public class T15 {
	public static void main(String[] args) {
		String[] strs = {"ccc","aaa","bbb","ccc"};
		

//		HashSet<String> hs = new HashSet<String>();
//		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		TreeSet<String> hs = new TreeSet<String>();
		
		
		for (String s : strs) {
			if(hs.add(s)==false){
				break;
			}
		
		}
		System.out.println(hs.toString());
		System.out.println(hs.headSet("ccc").toString());  //ain't contains bbb
		Iterator<String> it = hs.iterator();	//repeater
		while(it.hasNext()){
			System.out.println(it.next());
		}
//		it.remove();
		for (String string : hs) {
			System.out.println(string);
		}
	}
}
