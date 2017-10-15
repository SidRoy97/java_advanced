import java.util.Scanner;

public class pattern{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		//System.out.println(n);
		int i;
		int j;
		for(i=n;i>0;i--){
			for(j=0;j<i;j++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}