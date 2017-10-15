public class Ex3
{
	public static void main(String[] args)
	{
		// 1. method call in a instance method of a superclass
		//		is polymorphic
		/*
		 A a = new B(); 
		 a.driver();
		 a.foo(); // polymorphic
		*/
		// 2. method call in a static method of a superclass
		//		is polymorphic
		//A.driver2(); 
		// 3. static methods are not polymorphic
		//A a = new B(); a.bar(); 
		// 4. call to private instance methods in a class
		//		is not polymorphic
		// A a = new B(); 
		// a.driver4();
		// 5. call to methods in the ctor of superclass should
		// not be polymorphic; but they are!!!
			A a = new B();

	}
}

class A
{
	public A()
	{
		foo();
	}
	public void driver()
	{
		foo();
	}
	public static void driver2()
	{
		A a = new B();
		a.foo(); // polymorphic
	}

	public void foo() { System.out.println("foo A"); }
	public void driver4()
	{
		foo4();
	}
	private void foo4() { System.out.println("foo A"); }
	public static void bar()
	{
		System.out.println("A bar"); 
	}
}

class B extends A
{
	public void foo() { System.out.println("foo B"); }
	//@Override
	private void foo4() { System.out.println("foo B"); }
	public static void bar()
	{
		System.out.println("B bar"); 
	}
}
