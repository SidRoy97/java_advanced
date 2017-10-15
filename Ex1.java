// an object of subclass will have an object of superclass within it
//		only one; unnamed
// default ctor of the subclass will invoke the ctor of the superclass
// an object can be initialized by calling its ctor

public class Ex1
{
	public static void main(String[] args)
	{
		//P2D p2 = new P2D();
		P3D p3 = new P3D();
		p3.disp();
		P3D q3 = new P3D(11, 12, 13);
		q3.disp();
	}
}
class P2D
{
	private int x;
	private int y;
	public P2D(int x, int y)
	{
		this.x = x; this.y = y;
		System.out.println("ctor of P2D");
	}
	public void disp()
	{
		System.out.println("x : " + x);
		System.out.println("y : " + y);

	}
}
// should initialize the superclass object before the subclass object

class P3D extends P2D
{
	private int z;
	public P3D()
	{
		super(3, 4); // first stmt in the ctor of subclass
		System.out.println("ctor of P3D");
	}
	public P3D(int x, int y, int z)
	{
		super(x, y); // first stmt in the ctor of subclass
		this.z = z;
		System.out.println("ctor of P3D");
	}
	// interface should remain an interface
	@Override   // annotation
	public void disp()
	{
		super.disp();
		System.out.println("z : " + z);
	}
}







