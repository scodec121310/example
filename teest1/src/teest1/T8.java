package teest1;

public class T8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey m1 = new Monkey("Money");
		Monkey m2 = new Monkey("Peter");
		Monkey m3 = new Monkey("CCR");
		System.out.println(Monkey.count);
		m1=null;
		m2=null;
		m3=null;
		System.gc();
		System.out.println(Monkey.count);
	}

}
class Monkey{
	static int count;
	String name;
	protected void finalize(){
		count--;
		System.out.println(count);
	}
	public Monkey(String name){
		this.name = name;
		count++;
	}
	public Number md1(int v1) throws InterruptedException{
		return new Integer(100);
	}
}
class Ape extends Monkey{
	public Number md1(int v1) throws InterruptedException{		//回傳值integer屬於number. 所以可以回傳值可以是子類別
		return new Integer(200);	
	}
	
	public Ape(){
		super("人猿");
	}
	
}
