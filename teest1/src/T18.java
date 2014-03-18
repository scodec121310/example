import java.util.*;

public class T18 {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("LBJ");
		pq.add("KOBE");
		pq.add("PAYTON");
		pq.add("O'NEAL");
		pq.add("T-MAC");
		System.out.println(pq.toString());
//		
		String s=null;
//		while((s=pq.poll())!=null){
//			System.out.println("removed: "+s);
//			
//		}
		while (true) {		//remove ²£¥Íexception. -> try catch
			try {
				s = pq.remove();
				System.out.println("removed: "+s);
			}catch (Exception e) {
				break;
			}
		}
		
	}
}
