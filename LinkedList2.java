public class LinkedList2{
	public static void main(String args[]){
		LL list1 = new LL();

		list1.insert(1);
		list1.insert(2);
		list1.insert(3);
		list1.insert(4);
		list1.insert(5);
		list1.insert(6);
	
		list1.printList();

		LL list2 = new LL();

		list2.insert(10);
		list2.insert(100);
		list2.insert(1000);
		list2.insert(10000);

		
		
		list2.printList();

		/*node f2 = new node();
		f2 = list2.getFront();
		node e2 = new node(); 
		e2 = list2.getFront();

		while(e2.getNext() != null){
			e2 = e2.getNext();
		}

		System.out.println("Front = "+ f2.getData());
		System.out.println("END = "+ e2.getData());*/

		list1.join(list2,2);
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

	/*public void insert_end(int x){
		node temp = new node();
		temp.setData(x);
		temp.setNext(null);

		node i = new node();
		i = front;
		
		while(i.getNext() != null){
			i = i.getNext();
		}

		i.setNext(temp);

	}*/
	
	public void join(LL l2, int p){
		node current1 = new node();
		current1 = getFront();
		node previous1 = new node(); 
		previous1 = null;

		node f2 = new node();
		f2 = l2.getFront();
		node e2 = new node(); 
		e2 = l2.getFront();

		while(e2.getNext() != null){
			e2 = e2.getNext();
		}

		int pos = 1;
		while(current1 != null && pos != p){
			previous1 = current1;
			current1 = current1.getNext();
			pos++;
		}

		if(current1 == null){
			if(pos == p){
				previous1.setNext(f2); 
			}
			else{
				System.out.println("Invalid position");
			}
		}	

		else{
			if(previous1 == null){
				this.front = f2;
			}
			else{
				previous1.setNext(f2);
			}
			e2.setNext(current1);
		}
		this.printList();
		/*System.out.println("Front = "+ f2.getData());
		System.out.println("END = "+ e2.getData());*/
	}
}