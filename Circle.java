import java.util.*;
public class Circle extends Shape
{
	private double radius;
	public void read()
	{
		Scanner scanner = new Scanner(System.in);
		radius = scanner.nextDouble();

	}
	public void disp()
	{
		System.out.println("radius : " + radius);
	}
	public double area()
	{
		return 3.14 * radius * radius;
	}
	public double peri()
	{
		return 2 * 3.14 * radius;
	}
}
