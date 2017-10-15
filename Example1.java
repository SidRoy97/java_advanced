// array:
//	# of elements (collection or container)
//  homogeneous	
//	contiguous memory
//	no name for each element
//	element selected by index or subscript
//	index : int
//	lower bound : 0
//	random access
//	size of the array fixed at the point of creation
//	java:
//		reference type
public class Example1
{
	public static void main(String[] args)
	{
/*
		//int a[5];	// NO
		int a[];
		int[] b;
		a = new int[5];
		b = new int[] {11, 22, 33, 44, 55};
		int[] c = {1, 2, 3, 4, 5};
		//b.length = 3;
		disp(b);
//		disp(a);
//		disp(c);
*/
/*
		int[] d;
		d = a;
		d[0] =  1000;
		disp(a);
*/

		int[][] x = new int [3][];
		x[0] = new int[]{1, 2, 3, 4};
		x[1] = new int[]{5, 6, 7};
		x[2] = new int[]{8, 9};
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0; j < x[i].length; j++)
			{
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}

		for(int[] v : x)
		{
			v[0] = 1000;
			for(int e : v)
			{
				System.out.print(e + " ");
			}
			System.out.println();
		}
		for(int[] v : x)
		{
			for(int e : v)
			{
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}
	static void disp(int[] x)
	{
		/*
		System.out.println(x.length);
		for(int i = 0; i < x.length; ++i)
		{
			System.out.print(x[i] + " ");
		}
		System.out.println();
		*/
		// enhanced for loop
		// a copy of the element of the collection
		/*
		for(int e : x)
		{
			e += 100;
			System.out.print(e +  " ");			
		}
		System.out.println();
		*/
		for(int e : x)
		{
			System.out.print(e +  " ");			
		}
		System.out.println();
	}

}




