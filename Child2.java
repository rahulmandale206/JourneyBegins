package inheritanc;

public class Child2 extends Parents{
	
	public static void tv()
	{
		System.out.println("tv method from child2 class");
	}
	
	public static void main(String[] args) {
		Child2 c2 = new Child2();
		c2.furniture();
		c2.bikes();
		house();
		farm();
		tv();
	}

}
