import java.util.*;

public class Rect extends Shape
{
	private double length;
	private double breadth;
	public void read()
	{
		Scanner scanner = new Scanner(System.in);
		length = scanner.nextDouble();
		breadth = scanner.nextDouble();

	}
	public void disp()
	{
		System.out.println("length : " + length);
		System.out.println("breadth : " + breadth);

	}
	public double area()
	{
		return length * breadth;
	}
	public double peri()
	{
		return 2 * (length + breadth);
	}
}
