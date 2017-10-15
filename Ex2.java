public class Ex2
{
	public static void main(String[] args)
	{
		Test t = new Test();
		t.foo(1729);
	}
}
// resolution of function calls:
// 1. find candidate functions (based on # of arg and para)
// 2. check for access
// 3. find the best match
class Test
{
	public void foo(double d)
	{
		System.out.println("Test foo double");
	}
	private void foo(int d)
	{
		System.out.println("Test foo int");
	}
}
