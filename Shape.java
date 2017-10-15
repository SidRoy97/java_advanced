// has behaviour based on the value of an attribute
// when we add a new value for the attribute, the existing code
//	breaksdown
// 
/*
public class Shape
{
	private Rect rect;
	private Circle circle;
	private Type t;
	public Shape(Type t)
	{
		this.t = t;
		if(t == Type.RECT)
		{
			rect = new Rect();
		}
		else if(t == Type.CIRCLE)
		{
			circle = new Circle();
		}
	}
	public void read()
	{
		if(t == Type.RECT)
		{
			rect.read();
		}
		else if(t == Type.CIRCLE)
		{
			circle.read();
		}
	}
	public void disp()
	{
		if(t == Type.RECT)
		{
			rect.disp();
		}
		else if(t == Type.CIRCLE)
		{
			circle.disp();
		}

	}
	public double area()
	{
		if(t == Type.RECT)
		{
			return rect.area();
		}
		else if(t == Type.CIRCLE)
		{
			return circle.area();
		}
		else
		{
			return 0.0;
		}
	}
	public double peri()
	{
		if(t == Type.RECT)
		{
			return rect.peri();
		}
		else if(t == Type.CIRCLE)
		{
			return circle.peri();
		}
		else
		{
			return 0.0;
		}
	}
}
*/
// an abstract class : cannot be instantiated
public abstract class Shape
{
	// no default implementation
	// or do not want to commit to any implementation
	public abstract void read();
	public abstract void disp();
	public abstract double area();
	public abstract double peri();

}

// overheads of inheritance:
// - table per class
// - pointer per object
// - extra dereferencing at runtime

// difference between overloading and overriding:
// overriding:
//	super class provides a default implementation
//	derive class modifies it

// overriding:
//	signatures should be same
//	methods in different classes
//	classes are related by inheritance
//	method dispatch is dynamic












