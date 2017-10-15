public class power{
	public static void main(String args[]){
		findPower obj = new findPower(2,3);

		System.out.println("power = "+ obj.powerOf());
	}
}

class findPower{
	private int n;
	private int p;

	public findPower(int x, int y){
		n = x;
		p = y;
	}

	public int powerOf(){
		Recurse obj = new Recurse();

		return(obj.find_Power(n, p));
	}

}

class Recurse{
	public int find_Power(int n, int p){
		if(p == 0){
			return 1;
		}
		return n * find_Power(n, p-1);
	}
}