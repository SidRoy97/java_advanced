import java.util.Scanner;

public class factorial{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = inp.nextInt();

		findFactof wrapper = new findFactof(n);
		System.out.println("Factorial = "+ wrapper.getFact());
	}
}
