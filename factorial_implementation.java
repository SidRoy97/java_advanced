class recursive{
	public int recursiveFact(int n){
		if(n == 1){
			return n;
		}
		return (n * recursiveFact(n-1));
	}
}

class findFactof{
	private int num;

	public findFactof(int n){
		this.num = n;
	}

	public int getFact(){
		recursive obj = new recursive();

		return (obj.recursiveFact(num));
	}
}