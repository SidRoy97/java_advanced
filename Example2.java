public class Example2
{
	public static void main(String[] args)
	{
		Test a = new Test(10);
		Test b = new Test(20);

		// copy the reference
		Test c = a;
		System.out.println(a.t + " " + c.t);
		c = b; // modifying the reference
		System.out.println(a.t + " " + c.t);

		c = a;
		System.out.println(a.t + " " + c.t);
		c.t = 30; // a.t also changes; changing thro the reference
		
		System.out.println(a.t + " " + c.t);
	
	}
}

class Test
{
	public int t;
	public Test(int t) { this.t = t; }
}
