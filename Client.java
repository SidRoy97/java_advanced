public class Client
{
	public static void main(String[] args)
	{
	/*
		Shape s = new Shape(Type.RECT);
		s.read();
		s.disp();
		System.out.println("area : " + s.area());
		System.out.println("peri : "  + s.peri());

		s = new Shape(Type.CIRCLE);
		s.read();
		s.disp();
		System.out.println("area : " + s.area());
		System.out.println("peri : "  + s.peri());
	*/
		Shape s = new Rect();
		s.read();
		s.disp();
		System.out.println("area : " + s.area());
		System.out.println("peri : "  + s.peri());

		s = new Circle();
		s.read();
		s.disp();
		System.out.println("area : " + s.area());
		System.out.println("peri : "  + s.peri());

	}
}
