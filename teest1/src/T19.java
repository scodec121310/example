import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;


public class T19 {

	public static void main(String[] args) {
		//HashMap<Integer, String> hm = new HashMap<Integer,String>();	
		TreeMap<Integer, String> hm = new TreeMap<Integer,String>();
		hm.put(100, "LBJ");
		hm.put(200, "Morgan");
		hm.put(300, "Leo");
		hm.put(400, "KOBE");
		hm.put(500, "A-Rod");
		System.out.println(hm.toString());
		hm.remove(400);
		System.out.println(hm.toString());
		Iterator<String> it = hm.values().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
