public class LinkedList3{
	public static void main(String args[]){
		LL list1 = new LL();

		/*list1.insert(6);
		list1.insert(5);
		//list1.insert(4);
		list1.insert(3);
		//list1.insert(2);
		list1.insert(1);

		list1.printList();
		System.out.println("SUM : "+list1.sum());
*/
		list1.order(2);
		list1.order(6);
		list1.order(1);
		list1.printList();
	}
}


class node{
	private int data;
	private node next;

	public int getData(){
		return data;
	}

	public void setData(int d){
		data = d;
	}

	public void setNext(node n){
		next = n;
	}

	public node getNext(){
		return next;
	}
}

class LL{
	private node front = new node();

	public LL(){
		front = null;
	}

	public node getFront(){
		return front;
	}

	public boolean empty(){
		return (front == null);
	}

	public void insert(int x){
		node temp = new node();
		temp.setData(x);
		temp.setNext(front);
		front = temp;
	}

	public void printList(){
		node i = new node();
		i = front;

		while(i != null){
			System.out.print(i.getData()+"-->");
			i = i.getNext();
		}
		System.out.print("\n");
	}

	public int sum(){
		return(listSum(this.front));
	}

	public int listSum(node f){
		node t = new node();
		t = f;

		if(t.getNext() == null){
			return t.getData();
		}
		return t.getData() + listSum(t.getNext());
	}

	public void order(int x){
		node t = new node();
		t.setData(x);
		t.setNext(null);
		insert_order(front,t);

	}
	public void insert_order(node f, node t){
		if(f != null){
			if((f.getData() > t.getData())){
				if(f == front){
					t.setNext(front);
					front = t;
				}
				else{
					node temp = new node();
					temp = front;
					//System.out.println("f = "+ f.getData());

					while(temp.getNext() != f){
						temp = temp.getNext();
					}

					t.setNext(f);
					temp.setNext(t);
				}
			}
			else{
				insert_order(f.getNext(), t);
			}
		}
		else{
			if(front == null){
				front = t;
			}
			else{
				node temp = new node();
				temp = front;
				//System.out.println("f = "+ f.getData());

				while(temp.getNext() != null){
					temp = temp.getNext();
				}
				temp.setNext(t);
			}
		}
	}
}
