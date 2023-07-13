package inheritanc;

public class Child1 extends Parents{
	
	public void sofa()
	{
		System.out.println("sofa method from child1 class");
	}
	
	public static void main(String[] args) {
		
		Child1 c = new Child1();
		
		c.bikes();
		c.sofa();
		c.furniture();
		house();
		farm();
		
		
	}

}
