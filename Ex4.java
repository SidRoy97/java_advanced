public class Ex4
{
	public static void main(String[] args)
	{
		int a[] = {1, 2, 3, 4, 5};
		System.out.println("sum : " + MyMath.acc(a));
		System.out.println("sum : " + MyMath.acc(a, 0));
		System.out.println("sum : " + MyMath.acc(a, 100));
		System.out.println("sum : " + MyMath.acc(a, 100, new Add()));
		System.out.println("sum : " + MyMath.acc(a, 0, new Add()));
		System.out.println("sum : " + MyMath.acc(a, 1, new Mul()));
	}
	
}
class MyMath
{
	// return sum of the elements in an array
	static int acc(int[] x)
	{
		int res = 0;
		for(int e : x)
		{
			res += e;
		}
		return res;
	}
	static int acc(int[] x, int res)
	{
		for(int e : x)
		{
			res += e;
		}
		return res;
	}
	/*
	static int acc(int[] x, int res, Add op)
	{
		for(int e : x)
		{
			res  = op.invoke(res, e);
		}
		return res;
	}
	static int acc(int[] x, int res, Mul op)
	{
		for(int e : x)
		{
			res  = op.invoke(res, e);
		}
		return res;
	}
	*/
	static int acc(int[] x, int res, BinOp op)
	{
		for(int e : x)
		{
			res  = op.invoke(res, e);
		}
		return res;
	}

}
abstract class BinOp
{
	abstract public int invoke(int x, int y);
}
class Add extends BinOp
{
	public int invoke(int x, int y)
	{
		return x + y;
	}
}
class Mul extends BinOp
{
	public int invoke(int x, int y)
	{
		return x * y;
	}
}




