public class Example3
{
	public static void main(String[] args)
	{
		What w1;
	//	w1 = new What(10);
		w1 = What.foo();
		What w2;
		w2 = What.foo();
		System.out.println(w1 == w2);
	}
}

// static method:
//	class method
//	can be invoked using the classname

class What
{
	private int n;
	private static What temp; // one for the class
	// not for every object
	private What(int n)
	{
		this.n = n;
	}
	public static What foo()
	{
		if(temp == null)
		{
			temp = new What(12);
		}
		return temp;
	}
}








