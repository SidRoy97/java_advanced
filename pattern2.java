import java.util.Scanner;

public class pattern2{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		//System.out.println(n);
		int i;
		int j;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(i == 0 || i == n-1){
					System.out.print("* ");
				}
				else{
					if(j == 0){
						System.out.print("* ");		
					}
					if(j == n-2){
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}

				}
				
			}
			System.out.print("\n");
		}
	}
}