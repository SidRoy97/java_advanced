public class Example4
{
	public static void main(String[] args)
	{
/*
		Number n1 = new Number(10);
		Number n2 = new Number(20);
		n1.disp();
		n2.disp();
		System.out.println(Number.count);
		// the object is passed implicitly as the first arg
		n1.dispCount(); // Number.dispCount()
		Number.dispCount();
*/
		System.out.println(What.n);
		System.out.println(What.n1);
		System.out.println(What.n2);
	}

}

class Number
{
	public static int count;
	private int n;
	// no implicit parameter : this
	public static void dispCount()
	{
		System.out.println(count);
		//System.out.println(n); // NO
		Number temp = new Number(111);
		temp.n = 222;

	}
	public Number(int n)
	{
		this.n = n;
		count++;
	}
	public void disp()
	{
		System.out.println("n : " + n  + ",count : " + count);
	}
}
// static method:
//	behaviour of the class
//	use:
//	a) play with static members
//	b) entry into the class
//	c) make methods to create objects(factory or singletom)
//	d) support convention



class What
{
	public static int n;
	public static int n1 = 100;
	public static int n2 = 200;
	static {
		n2 = 300;
	}
}




